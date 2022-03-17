/**
 * Created by Arabic on 01/02/22.
 */
public class ArrayQueue<E>implements Queue<E> {
    static final int CAPACITY=100;
    int f=0;
    int sz=0;
    E data[];

    public ArrayQueue(int c) {
        data =(E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enQueue(E element) {
        if (size() == data.length)
        throw new IllegalStateException("Queue is full");
       int i =(f+sz)% data.length;
        data[i] =element;
        sz++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E Del=data[f];
        data[f]=null;
        sz--;
        f=(f+1)% data.length;
        return Del;
    }

    @Override
    public E frist() {
    if (isEmpty())
        return null;
        return data[f];
    }
}
