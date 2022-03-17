/**
 * Created by Administrator on 1/24/2022.
 */
public class SinglyLinkedList<E> {
    Node<E>head=null;
    Node<E>tail=null;
    int size=0;
    public SinglyLinkedList() {
    }


    public boolean isEmpty()
    {
        return size==0;
    }

    public int size()
    {

        return size;
    }

    public E first()
    {
        if (isEmpty())return null;
        return head.getElement();
    }

    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();

    }


   public void addFirst(E element)
   {
       head=new Node<E>(element,head);

       if (size==0)
           tail=head;
       size++;
   }

    public void addLast(E element)
    { Node<E>newest= new Node<E>(element,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        size++;


    }

    public E removeFirst()
    {
        if (isEmpty())
            return null;
        E deleted=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;

        return deleted;
    }

    private static class Node<E>
    {
       private E element;
       private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
