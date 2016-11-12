package Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Map1 {
	 public static void main(String[] args) throws IOException{
		 Map<Integer, String> hm = new HashMap<Integer, String>();
		   File file = new File("textRead.txt");
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String line;
	        int i=1;
	        while((line = br.readLine()) != null){
	          hm.put(i, line);
	          i++;
	        }
	        br.close();
	        fr.close();
	        System.out.println(hm);
	       int j=2;
	        try(FileWriter writer = new FileWriter("C:\\Users\\Рома\\workspace\\Task7-8\\textWrite.txt", false))
	        {
	        	while(j<hm.size())
	        	{
	        			writer.write(hm.get(j)+"\r\n");
	        		j=j*2;
	        	}
	            writer.append('\n');
	            writer.flush();
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
	    } 
	
}
