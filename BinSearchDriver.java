package CSS_143.Recursion;
/**
 * Linear and Binary Search Homework Driver
 * CSS 143
 *
 * Note that nothing in this class needs to be changed except for your FILE_AND_PATH variable
 *
 * Implement the Binary Search using both the iterative and recursive techniques covered
 * in class
 *
 * Originally made by Nash & Olsen, edits by David Nixon 2022
 */

import java.io.File;
import java.util.ArrayList; // nah, use YOUR ArrayList.
import java.util.Scanner;

public class BinSearchDriver {

    public final static String FILE_AND_PATH = "C:/Users/kenji/IdeaProjects/css143/src";
    /*
     * TODO: Be sure to change the FILE_AND_PATH to point to your local
     * copy of longwords.txt or a FileNotFoundException will result
     */

    public static void main(String[] args)  {
        try { // for catching the FileNotFound exception when opening the file.

            // First, let's read all the words from the file into an ArrayList and count them:

            Scanner input = new Scanner(new File("longwords.txt"));
            int wordCount = 0;
            ArrayList<String> theWords = new ArrayList<String>();

            //read in words, count them
            while(input.hasNext())  {
                theWords.add( input.next() );
                wordCount++;
            }


            // Next, we'll make a standard array from that ArrayList
            // (because the search methods work on arrays, not ArrayLists) :
            String[] wordsToSearch = new String[theWords.size()];
            theWords.toArray(wordsToSearch);


            // Now let's do our searches:

            //start with the linear searches
            System.out.println("Linear Searches (iterative): ");
            try {
                tryLinearIterativeSearch(wordsToSearch, "DISCIPLINES");
                tryLinearIterativeSearch(wordsToSearch, "TRANSURANIUM");
                tryLinearIterativeSearch(wordsToSearch, "HEURISTICALLY");
                tryLinearIterativeSearch(wordsToSearch, "FOO");
            }
            catch (Exception e){
                System.out.println("Oops! It looks like your iterative linear search threw an exception: " + e.getMessage());
            }

            System.out.println();
            System.out.println("Linear Searches (recursive): ");
            try {
                tryLinearRecSearch(wordsToSearch, "DISCIPLINES");
                tryLinearRecSearch(wordsToSearch, "TRANSURANIUM");
                tryLinearRecSearch(wordsToSearch, "HEURISTICALLY");
                tryLinearRecSearch(wordsToSearch, "FOO");
            }
            catch (StackOverflowError e){
                System.out.println("Oops! It looks like your recursive linear search threw a Stack Overflow Error!!" );
            }

            System.out.println();
            //and compare these results to the binary searches

            System.out.println();
            System.out.println("Binary Searches (iterative): ");
            try {
                tryBinaryIterativeSearch(wordsToSearch, "DISCIPLINES");
                tryBinaryIterativeSearch(wordsToSearch, "TRANSURANIUM");
                tryBinaryIterativeSearch(wordsToSearch, "HEURISTICALLY");
                tryBinaryIterativeSearch(wordsToSearch, "FOO");
            }
            catch (Exception e){
                System.out.println("Oops! It looks like your iterative binary search threw an exception: " + e.getMessage());
            }

            System.out.println();
            System.out.println("Binary Searches (recursive): ");
            try {
                tryBinaryRecSearch(wordsToSearch, "DISCIPLINES");
                tryBinaryRecSearch(wordsToSearch, "TRANSURANIUM");
                tryBinaryRecSearch(wordsToSearch, "HEURISTICALLY");
                tryBinaryRecSearch(wordsToSearch, "FOO");
            }
            catch (Exception e){
                System.out.println("Oops! It looks like your recursive binary search threw an exception: " + e.getMessage());
            }


        }
        catch (Exception e){
            System.out.println("File not found");
        }

    } // end main

    /**
     * tryBinaryRecSearch
     * ------------------
     * This attempts to do a binary recursive search and reports the number of comparisons
     * precondition: wordsToSearch is a nonempty array of Strings, and target is a non-null string to search for
     *                  in our collection of strings
     * postcondition: Uses a BinarySearch object (which implements this style of search) to try to find the target string
     */
    private static void tryBinaryRecSearch(String[] wordsToSearch, String target) {
        //Todo: Build a BinarySearch class that inherits from SearchAlgorithm, and put it in the same directory as this class to successfully compile
        SearchAlgorithm bs = new BinarySearch();

        try {
            System.out.println("  Binary Rec Search: " + target + " found at index: " + bs.recSearch(wordsToSearch,target));
            System.out.println( " taking " + bs.getCount() + " comparisons.");
        }
        catch( ItemNotFoundException e ) {
            System.out.println( "Exception in tryBinaryRecSearch() with target '" + target + "':" + e.getMessage());
        }
    }

    /**
     * tryBinaryIterativeSearch
     * ------------------------
     * This attempts to do a binary iterative search and reports the number of comparisons
     * precondition: wordsToSearch is a nonempty array of Strings, and target is a non-null string to search for
     *                  in our collection of strings
     * postcondition: Uses a BinarySearch object (which implements this style of search) to try to find the target string
     */
    private static void tryBinaryIterativeSearch(String[] wordsToSearch, String target) {
        //Todo: Build a BinarySearch class that inherits from SearchAlgorithm, and put it in the same directory as this class to successfully compile
        SearchAlgorithm bs = new BinarySearch();

        try {
            System.out.println("  Binary Iterative Search: " +  target + " found at index: " + bs.itSearch(wordsToSearch,target));
            System.out.println( " taking " + bs.getCount() + " comparisons.");
        }
        catch( ItemNotFoundException e ) {
            System.out.println( "Exception in tryBinaryIterativeSearch() with target '" + target + "':" + e.getMessage());
        }
    }

    /**
     * tryLinearIterativeSearch
     * -------------------------
     * This attempts to do a linerar iterative search and reports the number of comparisons
     * precondition: wordsToSearch is a nonempty array of Strings, and target is a non-null string to search for
     *                  in our collection of strings
     * postcondition: Uses a LinearSearch object to try to find the target string
     */
    private static void tryLinearIterativeSearch(String[] wordsToSearch, String target) {
        //Todo: Build a LinearSearch class that inherits from SearchAlgorithm, and put it in the same directory as this class to successfully compile
        SearchAlgorithm ls = new LinearSearch();

        try {
            System.out.println("  Linear Iterative Search: " +  target + " found at index: " + ls.itSearch(wordsToSearch,target));
            System.out.println( " taking " + ls.getCount() + " comparisons.");

        }
        catch( ItemNotFoundException e ) {
            System.out.println( "Exception in tryLinearIterativeSearch() with target '" + target + "':" + e.getMessage());
        }
    }

    /**
     * tryLinearIterativeSearch
     * -------------------------
     * This attempts to do a linerar recursive search and reports the number of comparisons
     * precondition: wordsToSearch is a nonempty array of Strings, and target is a non-null string to search for
     *                  in our collection of strings
     * postcondition: Uses a LinearSearch object to try to find the target string
     */
    private static void tryLinearRecSearch(String[] wordsToSearch, String target) {
        //Todo: Build a LinearSearch class that inherits from SearchAlgorithm, and put it in the same directory as this class to successfully compile
        SearchAlgorithm ls = new LinearSearch();

        try {
            System.out.println("  Linear Rec Search: " +  target + " found at index: " + ls.recSearch(wordsToSearch,target));
            System.out.println( " taking " + ls.getCount() + " comparisons.");

        }
        catch( ItemNotFoundException e ) {
            System.out.println( "Exception in tryLinearRecSearch() with target '" + target + "':" + e.getMessage());
        }
    }

}
