package CSS_143.Recursion;

/** Kenji Tablazon
 *  2/6/2024
 */

public class FileDriver {

    public static void main(String[] args){
        String targetFile = "Fraction.java";
        String pathToSearch = "C:/Users/kenji/IdeaProjects/css143/src";

        FindFile finder = new FindFile(20); //sets max files to 20

        try{
            finder.directorySearch(targetFile, pathToSearch);

            String[] filesFound = finder.getFiles();
            int count = finder.getCount();

            //amount of files found
            System.out.println("Found " + count + " files.");

            //for loop to print out array of Strings
            for(int i = 0; i < filesFound.length; i++){
                System.out.println("File name: " + filesFound[i]);
            }

            //Should print 2 files found, because I have the Fraction.java from this CSS_143 class and I have the Fraction.java from CSS143_LABS.Lab1.Lab3 of this quarter


        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }







    }


}
