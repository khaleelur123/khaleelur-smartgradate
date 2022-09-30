package smartgraduates;

public class largestnumber {
	public static void main(String[] args) {
		double n1=1999,n2=2000,n3=2000.50;
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+ "is a largest number.");
		if(n2>=n3 && n2>=n1)
			System.out.println(n2+ "is a largest number.");
		if(n3>=n2 && n3>=n1)
			System.out.println(n3+ "is a largest number.");
	}

}
