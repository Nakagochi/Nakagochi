import java.util.Scanner;

public class LabExceptionHandilng {
	public static void main(String[] args) {
		int digit = numberFromUser();
		int result = sevenModulusN(digit);
		System.out.printf("7 %% %d = %d", digit, result);
	}

	private static int numberFromUser() {
		boolean valid = false;
		int x = 0;
		while (!valid) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.print("number: ");

				x = input.nextInt();
				if(x == 0) {
					throw new IllegalArgumentException();
				}
				valid = true;
			} catch (IllegalArgumentException e) {

				System.out.println("Can’t calculate 7 % 0 ");
			}catch (Exception e) {

				System.out.println("Need to be a whole number");
			}
		}
		return x;

	}

	private static int sevenModulusN(int number) {
		return 7 % number;
	}
}
