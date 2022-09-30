package smartgraduates;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] agrs) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number..:");
		int num=reader.nextInt();
		if(num%2==0)
			System.out.println(num+"is a even number");
		else
			System.out.println(num+" is a odd number");
	}

}
