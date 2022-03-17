/**
 * Created by LAB on 3/1/2022.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E el);
    E pop();
    E top();
}
