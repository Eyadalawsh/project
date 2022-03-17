public class ArrayStack<T> implements Stack<T> {
    private T[] data;
    static final int CAPACITY = 100;
    private int index = -1;

    public ArrayStack(int size) {
        data = (T[]) new Object[size];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return this.index == -1;
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public void push(T element) {
        if(this.data.length == this.size())
            throw new IllegalStateException("The Stack Is Full");

        this.data[++this.index] = element;
    }

    @Override
    public T pop() {
        if(this.isEmpty())
            return null;

        T deleted = this.data[this.index];
        this.index--;
        return deleted;
    }

    @Override
    public T top() {
        if(this.isEmpty()) return null;
        return this.data[this.index];
    }
}