package CSS_143.Recursion;

import CSS_143.Recursion.LinearSearch;

public class SampleDriver {

    public static void main(String[] args)  {

        // Array of words for testing
        String[] wordsToSearch = {"DISCIPLINES", "TRANSURANIUM", "HEURISTICALLY", "FOO", /* add more words as needed */};

        // Now let's do our searches:

        // Start with the linear searches
        System.out.println("Linear Searches (iterative): ");
        try {
            tryLinearIterativeSearch(wordsToSearch, "DISCIPLINES");
            tryLinearIterativeSearch(wordsToSearch, "TRANSURANIUM");
            tryLinearIterativeSearch(wordsToSearch, "HEURISTICALLY");
            tryLinearIterativeSearch(wordsToSearch, "FOO");
        } catch (Exception e) {
            System.out.println("Oops! It looks like your iterative linear search threw an exception: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Linear Searches (recursive): ");
        try {
            tryLinearRecSearch(wordsToSearch, "DISCIPLINES");
            tryLinearRecSearch(wordsToSearch, "TRANSURANIUM");
            tryLinearRecSearch(wordsToSearch, "HEURISTICALLY");
            tryLinearRecSearch(wordsToSearch, "FOO");
        } catch (StackOverflowError e) {
            System.out.println("Oops! It looks like your recursive linear search threw a Stack Overflow Error!!");
        }

        System.out.println();
        // And compare these results to the binary searches

        System.out.println();
        System.out.println("Binary Searches (iterative): ");
        try {
            tryBinaryIterativeSearch(wordsToSearch, "DISCIPLINES");
            tryBinaryIterativeSearch(wordsToSearch, "TRANSURANIUM");
            tryBinaryIterativeSearch(wordsToSearch, "HEURISTICALLY");
            tryBinaryIterativeSearch(wordsToSearch, "FOO");
        } catch (Exception e) {
            System.out.println("Oops! It looks like your iterative binary search threw an exception: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Binary Searches (recursive): ");
        try {
            tryBinaryRecSearch(wordsToSearch, "DISCIPLINES");
            tryBinaryRecSearch(wordsToSearch, "TRANSURANIUM");
            tryBinaryRecSearch(wordsToSearch, "HEURISTICALLY");
            tryBinaryRecSearch(wordsToSearch, "FOO");
        } catch (Exception e) {
            System.out.println("Oops! It looks like your recursive binary search threw an exception: " + e.getMessage());
        }
    }

    // Your search methods go here (replace these method calls with your actual method names)

    private static void tryLinearIterativeSearch(String[] wordsToSearch, String target) {
        LinearSearch testIt = new LinearSearch();
        // Call your linear iterative search method and print results
    }

    private static void tryLinearRecSearch(String[] wordsToSearch, String target) {
        // Call your linear recursive search method and print results
    }

    private static void tryBinaryIterativeSearch(String[] wordsToSearch, String target) {
        // Call your binary iterative search method and print results
    }

    private static void tryBinaryRecSearch(String[] wordsToSearch, String target) {
        // Call your binary recursive search method and print results
    }
}
