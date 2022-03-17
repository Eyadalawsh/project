/**
 * Created by ASUS on 01/03/22.
 */
public class CircularLinkedList<E> {

    private Node<E> tail;
    private int size;
    public CircularLinkedList(){
        this.tail=null;
        this.size=0;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public E first(){
        return tail.getNext().getElement();
    }
    public E last(){
        return tail.getElement();
    }
    public void addFirst(E element){
        if(size==0){
            tail=new Node<E>(element,null);
            tail.setNext(tail);
        }
        else
        {
            Node<E>newest=new Node<E>(element,tail.getNext());
        }
        size++;
    }
    public void addLast(E element) {
        addFirst(element);
        tail=tail.getNext();

    }

    public void removeFirst(){
        if(isEmpty()) return null;
        Node<E> x=tail.getNext();
        if (x==tail)
            tail=null;
        else
            tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }

    public E removeFirst(){
        if(this.isEmpty())return null;
    }


    private static class Node<E>
    {
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
