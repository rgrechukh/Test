package JsonParse;
import java.lang.Object;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;



public class JacksonUsage {
	public static void main(String[] args) throws JarException, JarException, IOException {
		InputStream input = new FileInputStream("src/1.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<Student> students = objectMapper.readValue(input,
				typeFactory.constructCollectionType(
						ArrayList.class, Student.class));

		System.out.println(students.get(0).getName());
		System.out.println(students.get(0).getAge());
		System.out.println(students.get(0).getSurName());
}
}
