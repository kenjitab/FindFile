package CSS_143.Recursion;

import CSS_143.Recursion.ItemNotFoundException;

/**
 *
 * SearchAlgorithm
 *    A class used to delegate a search strategy or style
 *
 * @author: originally by cfolsen, modified by rnash, modified by Nixon 2023
 */
public abstract class SearchAlgorithm {

    /**
     * Method itSearch:
     *          A "to-be-defined" method used to implement an ITERATIVE search strategy over the given array looking for the target word
     * Precondition: words is a nonempty array and wordToFind is a non-null string
     * Postcondition: if the target word is found, return its index in words.
     *                If not found, throw an ItemNotFoundException (a subclass which you have to make)
     *
     */
    public abstract int itSearch(String[] words, String wordToFind) throws ItemNotFoundException;


    /**
     * Method recSearch:
     *          A "to-be-defined" method used to implement a RECURSIVE search strategy over the given array looking for the target word
     * Precondition: words is a nonempty array and wordToFind is a non-null string
     * Postcondition: if the target word is found, return its index in words.
     *                If not found, throw an ItemNotFoundException (a subclass which you have to make)
     *
     */
    public abstract int recSearch(String[] words, String wordToFind) throws ItemNotFoundException;

    /**
     * Utility Features: This class can be used to track the number of search comparisons
     *                   for use in comparing two different search algorithms
     */
    private int count = 0;
    public void incrementCount() {
        count++;
    }
    public int getCount() {
        return count;
    }
    public void resetCount() {
        count = 0;
    }
}
