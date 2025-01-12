package CSS_143.Recursion;
/** Kenji Tablazon
 *  2/7/2024
 */
public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(){
        super("Item was not found.");
    }
    public ItemNotFoundException(String message){
        super(message);
    }

}
