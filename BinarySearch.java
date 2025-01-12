package CSS_143.Recursion;

/** Kenji Tablazon
 *  2/6/2024
 */

public class BinarySearch extends SearchAlgorithm {

    /** itSearch()
     *  Description: This method will search through an array with the Binary Search algorithm and search for it iteratively
     *  Pre: none
     *  Post: none
     */
    @Override
    public int itSearch(String[] words, String target)throws ItemNotFoundException {
        resetCount();
        int low = 0;
        int high= words.length - 1;
        int mid = (low + high) / 2;

        

        while(low <= high){   //while loop that will keep cutting in half until the low and high meet
            incrementCount();
            //compareTo method to compare Strings

            if(words[mid].equals(target)){  //if the middle word is equal to the target word then it will return the middle index
                return mid;

            } else if (target.compareTo(words[mid]) < 0){   //if the target is less than the middle word then the high index will be 1 below mid
                high = mid - 1;

            } else if (target.compareTo(words[mid]) > 0){   //if the target is greater than the middle word than the low index will become to mid + 1
                low = mid + 1;
            }

        }
        throw new IllegalArgumentException();   //throws an exception if the word is not found
    }


    /** recSearch()
     *  Description: This method will use recursion to search through an array with the binary search algorithm and return the index
     *  Pre: none
     *  Post: none
     * @param words
     * @param target
     * @return
     * @throws ItemNotFoundException
     */
    @Override
    public int recSearch(String[] words, String target)throws ItemNotFoundException{
        resetCount();
        return recSearch(words, target, 0, words.length - 1);
    }



    private int recSearch(String[] words, String target, int low, int high)throws ItemNotFoundException{
        //base case
        if(low > high) throw new ItemNotFoundException("Target word not found in array");

        int mid = (low + high) / 2;
        incrementCount();
        if(target.equals(words[mid])){
            return mid;

        } else if(target.compareTo(words[mid]) < 0){    //if the target is less than the middle index, set high index to mid - 1
            return recSearch(words, target, low, mid - 1);

        } else if(target.compareTo(words[mid]) > 0){     // if the target is higher than the middle index it will make the low index: mid + 1
            return recSearch(words, target, mid + 1, high);
        }
        throw new ItemNotFoundException();
    }






}   //class braces
