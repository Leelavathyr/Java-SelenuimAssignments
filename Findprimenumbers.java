package week1.day1;

public class Findprimenumbers {

	public static void main(String[] args) {
		int num = 3;
		boolean Prime = true;
		for(int i=2; i<12; i++) {
			if (num % i == 0)
			{
				System.out.println("It is not a prime number");
				Prime = false;
			}
			
		}
		if (Prime == true) {
		System.out.println("Prime number");
		}
	}
}


	


