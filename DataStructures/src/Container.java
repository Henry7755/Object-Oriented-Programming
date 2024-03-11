/** Interface Container -- top level Container
 */
import java.io.Serializable;


public interface Container extends Serializable {
    /** Abstract Methods:
     *        makeEmpty
     *        isEmpty
     *        size
     * */

     void makeEmpty();
    boolean isEmpty();
    int size();


}
