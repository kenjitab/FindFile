package CSS_143.Recursion;

import java.io.File;


/** Kenji Tablazon
 *  2/6/2024
 */

public class FindFile {

    private String[] filesFound;    // an array of strings that holds the names of the files found
    private int fileCount;  // an integer that holds a number of amount of files that matched the target


    /** FindFile() Constructor
     *  Description: This constructor will take in an integer that represents the max amount of files they want to search for
     *  Pre: none
     *  Post: none
     * @param maxFiles
     */
    public FindFile(int maxFiles){
        this.filesFound = new String[maxFiles]; //sets an array to search the maximum amount of files with the passed in parameter in the constructor
        this.fileCount = 0; // set default fileCount to 0 as there are no files read yet
    }


    /** directorySearch()
     *  Description: This method takes in 2 Strings to search for the target parameter and start at a directory in a file
     *  Pre: target and dirName must be a valid name in your computer
     *  Post: none
     * @param target
     * @param dirName
     */
    public void directorySearch(String target, String dirName){
        File directory = new File(dirName);  //creates a File object to read a file that starts at the dirName directory

        if(!directory.isDirectory()){    //checks if the directory is valid in the computer
            throw new IllegalArgumentException(dirName + " is not a valid starting directory.");    // if not will throw exception message
        }

        recursiveSearch(target, directory);

    }


    /** recursiveSearch()
     *  Description: Helper method to search for target file recursively
     *  Pre: Parameters must be a String and a File type object
     *  Post: none
     * @param target
     * @param directory
     */
    private void recursiveSearch(String target, File directory){
        File[] files = directory.listFiles();   //stores all files in starting directory to an array of File objects

        //check if files array is null if not then loop through directory
        // if next file is a directory then go into directory and recall method
        // if next file is not a directory check if the file is equal to the target
        // if the file is equal to the target then add to the filesFound array and increase fileCount
        // if file is not equal to target and the fileCount has exceeded the max limit of files to read, then throw an exception

        if(files != null){  //if the current array of files is not empty then it will continue to search

            //for each loop to check each file in the array of files
            for(File currentFile : files) {
                if (currentFile.isDirectory()) {    //if the current file in the iteration is a new directory it will go inside that file
                    // recursion where if a new directory is found within the file then I recall this method and put in the target and start at the currentFile
                    recursiveSearch(target, currentFile);



                } else if (currentFile.getName().equals(target)) {  //if the currentFile searched has the same name as the target then continue


                    if (fileCount < filesFound.length) { //checks to make sure the fileCount hasn't exceeded the max limit the user declared in the constructor
                        filesFound[fileCount++] = currentFile.getAbsolutePath();    // adds the currentFile location to the filesFound array

                    } else {
                        //throws an Exception if the max amount of files to look for has been passed
                        throw new IllegalArgumentException("Maximum number of files to search for reached.");
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Directory is empty");
        }

    }   //method braces


    /** getCount()
     *  Description: This method will return an integer of the number of matching files found
     *  Pre: none
     *  Post: none
     */
    public int getCount(){
        return this.fileCount;
    }


    /** getFiles()
     *  Description: This method will return an array of file locations
     *  Pre: none
     *  Post: none
     */
    public String[] getFiles(){
        return this.filesFound; //returns an array of the files found
    }




}   //class braces
