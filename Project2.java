import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Project2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String fileTest = input.nextLine();
		File countryInfo = new File("Countries2.csv");
		Scanner sc = new Scanner(countryInfo);
		sc.nextLine();
		sc.useDelimiter(",|\n");
		Country[] fileInfo = new Country[155];
	}
}
