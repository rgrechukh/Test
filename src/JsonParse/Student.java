package JsonParse;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Student {

		private String name;
		private String surname;
		private int age;
		private Address address;

		@JsonCreator
		public Student(@JsonProperty("name") String name,
				@JsonProperty("surname") String surname, @JsonProperty("age") int age,
				@JsonProperty("address") Address address) {
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurName() {
			return surname;
		}

		public void setSurName(String surname) {
			this.surname = surname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

}
