
/*
 * Name: FileStats.java
 * Purpose: Counts characters, words, and lines in a text file.
 * Programmer: Alex Kurcan
 * Date: 11/06/2025
 */


/*
 * This program counts how many characters, words, and lines
 * are in the file poem.txt.
 */

import java.io.File;
import java.util.Scanner;

public class FileStats {

    public static void main(String[] args) {

        // Create a file object to open poem.txt
        File file = new File("C:\\Users\\alexkurcan\\Downloads\\poem.txt");
        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            // Scanner reads the file
            Scanner input = new Scanner(file);

            // Read each line one by one
            while (input.hasNextLine()) {

                String line = input.nextLine(); // Get the line
                lines++; // Count the line

                characters = characters + line.length(); // Add character count

                // If the line is not empty, count words
                if (line.trim().length() > 0) {
                    String[] wordArray = line.split(" "); // Split by spaces
                    words = words + wordArray.length;
                }
            }

            input.close(); // Close file when done

            // Print the results
            System.out.println("File " + file.getAbsolutePath() + " has");
            System.out.println();
            System.out.println(characters + " characters");
            System.out.println(words + " words");
            System.out.println(lines + " lines");

        } catch (Exception e) {
            // If the file cannot be opened or something goes wrong
            System.out.println("Could not open the file. Make sure poem.txt is in the same folder.");
        }
    }
}
