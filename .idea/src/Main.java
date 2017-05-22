import java.util.Scanner;

/**
 * Created by jmanrocks152 on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {
        //Variable initialization
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String nqString = scanner.nextLine();
        String delims = "[ ]+";
        String[] nqArray = nqString.split(delims);
        int numberOfSnakes, queries;
        String snakeLengthsString = scanner.nextLine();
        String[] snakeLengthsArray = snakeLengthsString.split(delims);

        //For loop that returns the values of nqArray and snakeLengthsArray
        //To do: set numberOfSnakes value to be the first value in the array and queries to be the second value

    }
}
