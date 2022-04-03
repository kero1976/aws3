package domain.entities;

public class UserEntity {

	private int age;
	
	private String name;
	
	public UserEntity(String name, int age) {
		this.name =name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
