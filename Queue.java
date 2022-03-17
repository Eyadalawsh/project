/**
 * Created by LAB on 3/1/2022.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E el);
    E dequeue();
    E first();
}
