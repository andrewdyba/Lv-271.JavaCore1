public class Person {
	private String name;
	private int birthYear;

	public Person() {
		name = "-";
		birthYear = 0;
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return birthYear;
	}

	public int age() {
		int ageOfPerson = 2017 - birthYear;
		return ageOfPerson;
	}

	public void input(String name, String year) {
		this.name = name;
		birthYear = year;

	}

	public String output() {
		return name + " " + birthYear + " " + age();
	}

	public changeName(String name)
	{
		this.name = name;
	}

	public void getYear() {
		return birthYear;
	}

	public void getName() {
		return name;
	}



	public static void main(String[] args) {
		Person Jhon = new Person("Jhon", 1995);
		Person Bill = new Person("Bill", 1980);
		Person Von = new Person("Von", 1978);
		Person Stive = new Person("Stive", 1979);
		Person Oleg = new Person("Oleg", 1983);
		
		System.out.println(Jhon.getName()+ " is " + Jhon.getYear() + " years old.");
		System.out.println(Bill.getName()+ " is " + Bill.getYear() + " years old.");
		System.out.println(Von.getName()+ " is " + Von.getYear() + " years old.");
		System.out.println(Stive.getName()+ " is " + Stive.getYear() + " years old.");
		System.out.println(Oleg.getName()+ " is " + Oleg.getYear() + " years old.");
}
}
