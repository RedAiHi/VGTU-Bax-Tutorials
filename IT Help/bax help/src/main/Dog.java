package main;

public class Dog 
{
	private String breed, gender, name;
	private int weight, birth;
	
	
	
	public Dog(String breed, String gender, String name, int birth, int weight) 
	{
		try {
			this.breed = breed;
			this.gender = gender;
			this.name = name;
			this.birth = birth;
			this.weight = weight;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Dog()
	{
		breed = "Cool";
		gender = "Helicopter";
		name = "Death";
		birth = 2000;
		weight = 5;
	}
	
	public int getAge(int year)
	{
		return (year - birth)*7;
	}

	@Override
	public String toString() {
		return "Dog (breed=" + breed + ", gender=" + gender + ", name=" + name + ", birth=" + birth + ", weight="
				+ weight + ")";
	}
	
	
}
