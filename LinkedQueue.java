/**
 * Created by LAB on 3/1/2022.
 */
public class LinkedQueue<E>implements Queue<E> {
    SinglyLinkedList<E>list= new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E el) {
list.addLast(el);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E first() {
        return list.first();
    }
}
