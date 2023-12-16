import java.util.Scanner;

public class PyramidPattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows for the pyramid:");

		int nrows = s.nextInt();

		int rowCount = 1;

		System.out.println("Pyramid Pattern: ");

		for (int i = nrows; i > 0; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
			rowCount++;
		}
		for (int i = nrows; i >= 1; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= nrows; j++) {
				System.out.print(j + " ");
			}
			for (int j = nrows - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}