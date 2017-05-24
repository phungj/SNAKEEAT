import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jmanrocks152 on 5/22/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //Variable initialization
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        String delims = "[ ]+";
        int numberOfSnakes,  currentQuery, largestSnakeLength = 0, numberOfPassingSnakes = 0, queries = 0;
        int arrayListOffset = 0;
        ArrayList<Integer> nqArrayList = new ArrayList<>();
        ArrayList<Integer> snakeLengthsArrayList = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        for(int i = 0; i < testCases; i++) {
            String nqString = reader.readLine();
            String[] nqArray = nqString.split(delims);
            String snakeLengthsString = reader.readLine();
            String[] snakeLengthsArray = snakeLengthsString.split(delims);

            try {
                for (String s : nqArray) {
                    nqArrayList.add(Integer.parseInt(s));
                }

                queries = nqArrayList.get(1);

                for (String s : snakeLengthsArray) {
                    snakeLengthsArrayList.add(Integer.parseInt(s));
                }
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }

            //For loop that ensures the program only activates for as many test cases there are

            for(int x = 0; x < queries; x++) {
                currentQuery = Integer.parseInt(reader.readLine());
                for(int i2 = 0; i2 < snakeLengthsArrayList.size(); i2++) {
                    if(snakeLengthsArrayList.get(i2) >= currentQuery) {
                        numberOfPassingSnakes++;
                        snakeLengthsArrayList.remove(i2);
                    }
                }
                for(int z = 0; z < snakeLengthsArrayList.size(); z++) {
                    if(z == 0) {
                        largestSnakeLength = snakeLengthsArrayList.get(0);
                    }
                    if(snakeLengthsArrayList.get(z) > largestSnakeLength) {
                        largestSnakeLength = snakeLengthsArrayList.get(z);
                    }
                    if(largestSnakeLength + (snakeLengthsArrayList.size() - 1) > currentQuery) {
                        numberOfPassingSnakes++;
                    }
                }
                results.add(numberOfPassingSnakes);
            }
            arrayListOffset = 0;
            numberOfPassingSnakes = 0;
        }

        for(Integer i : results) {
            System.out.println(results.get(i));
        }
    }
}
