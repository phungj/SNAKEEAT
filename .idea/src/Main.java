import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int numberOfSnakes, queries, currentQuery, numberOfPassingSnakes = 0;
        int arrayListOffset = 0;
        String snakeLengthsString = scanner.nextLine();
        String[] snakeLengthsArray = snakeLengthsString.split(delims);
        ArrayList<Integer> nqArrayList = new ArrayList<>();
        ArrayList<Integer> snakeLengthsArrayList = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        //For loop that adds the values of nqArray to nqArrayList and sets the respective variables to their values
        for(String s : nqArray) {
            nqArrayList.add(Integer.parseInt(s));
        }

        numberOfSnakes = nqArrayList.get(0);
        queries = nqArrayList.get(1);
        //Ditto
        for(String s : snakeLengthsArray) {
            nqArrayList.add(Integer.parseInt(s));
        }

        //For loop that ensures the program only activates for as many test cases there are
        for(int i = 0; i < testCases; i++) {
            for(int x = 0; x < queries; x++) {
                currentQuery = scanner.nextInt();
                for(int s : snakeLengthsArrayList) {
                    if(s >= currentQuery) {
                        numberOfPassingSnakes++;
                        snakeLengthsArrayList.remove(s - arrayListOffset);
                        arrayListOffset++;
                    }


                }
                for(int z = 0; z < snakeLengthsArrayList.size(); z++) {
                    //To do: add code that checks if the largest snake still remaining can get enough to pass the query
                }
            }
            currentQuery = 0;
            //Need to add another way to input a second test case
        }





    }
}
