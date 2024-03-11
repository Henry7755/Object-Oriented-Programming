/** Interface Stack -- A first-in last-out container
 * */

public interface Stack extends Container{
    void push(Object obj);
    void pop();
    Object top();
}
