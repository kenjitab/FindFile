package CSS_143.Recursion;

/** Kenji Tablazon
 *  2/6/2024
 */

public class LinearSearch extends SearchAlgorithm {


    /** itSearch()
     *  Description: This method will use the linear search algorithm to search through an array of Strings iteratively
     *  Pre: String type array and String target
     *  Post: none
     * @param words
     * @param target
     * @return int
     * @throws ItemNotFoundException
     */
    @Override
    public int itSearch(String[] words, String target)throws ItemNotFoundException{ //same header as abstract class in SearchAlgorithm
        resetCount();       //resets count every time a new search is called
        for(int i = 0; i < words.length; i++) {
            incrementCount();
            if (words[i].equals(target)) {
                return i;   //returns 'i' instead of words[i] to return the index other than the value
            }
        }
        throw new ItemNotFoundException("Word not found.");
    }


    /** recSearch()
     *  Description: This method will go through an array of Strings and search for a word recursively
     *  Pre: Array of String type and a String variable argument
     *  Post: none
     * @param words
     * @param target
     * @return
     */
    @Override
    public int recSearch(String[] words, String target)throws ItemNotFoundException{
        resetCount();
        return recSearch(words, target, 0);
    }


    /** recSearch() Overloading method
     *  Description: This method will take in an index to keep track and loop over each word in the array until a target is found or it will throw an exception
     *  Pre: String array, String variable, integer variable is thrown into argument
     *  Post: none
     * @param words
     * @param target
     * @param currentIndex
     * @return int
     */
    private int recSearch(String[] words, String target, int currentIndex)throws ItemNotFoundException{
        //base case, check to make sure the index is less than the length of the words array
        if(currentIndex < words.length){
            if(words[currentIndex].equals(target)){
                return currentIndex;
            } else {
                recSearch(words, target, currentIndex++); //increment index by 1 to search for next word in the array
            }

        }
        throw new ItemNotFoundException("Word not found.");
    }




}   //class braces
