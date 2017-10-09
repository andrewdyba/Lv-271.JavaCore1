package ttt;


class Emplyee {
	private String name;
	private int rate;
	private int hours;
	private int salary;
	private static int totalSum = 0;
    
    
	// geters
	private String getName() {
    	return name;
    }

	public int getRate() {
		return rate;
	}

	public int getHours() {
		return hours;
	}

	public static int getTotalSum() {
		return totalSum;
	}

	// comstructors
	public Emplyee() {
		name = "-";
		rate = 0;
		hours = 0;
		salary = hours*rate;
		

	}

	public Emplyee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		hours = 0;
		salary = hours*rate;
	}

	public Emplyee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		salary = hours*rate;
		totalSum = salary + totalSum;

	}
	
	public int salary(){
		return salary;
		
	}
	public void toString(){
		System.out.println("Name:" + name);
		System.out.println("Rate:" + rate);
		System.out.println("Hours:" + hours);
	}
	public void changeRate(int change) {
		rate = change;
	}
	public double bonuses() {
		return 10*(salary/100);
	}




	public static void main(String[] args) {
		
		Emplyee Bob = new Emplyee("Bob",12,3);
		Emplyee Frank = new Emplyee("Frank",15,2);
		Emplyee Dan = new Emplyee("Dan",14,6);
	
		System.out.println( Emplyee.getTotalSum() );
		
	   
		
	}


}
//є якийсь кращий спосіб це зробити без вставляння в всіх конструктори salary?
