package RandomAndDate;
import java.util.ArrayList;
import java.util.Random;

public class RandomUsage {
	Random rnd = new Random();
	ArrayList<String> lines = new ArrayList<String>();
	String validChars = "abcdefghijklmnopqrstuvwxyzABCEDFGHIJKLMNOPQRSTUVWXYZ1234567890";
	
	public void CreateString(){
	 for(int j=0; j<5; j++)  
	 {
		 char[] mas = new char[6+rnd.nextInt(15)];
	    for (int i = 0; i < mas.length; i++)
	    {
	       mas[i]=validChars.charAt(rnd.nextInt(validChars.length()));
	    }
	    String q = new String(mas);
	    lines.add(q);
	 }
	   
	}
	public void print()
	{
		System.out.println(lines);
	}
	}


