/**
 * Created by Arabic on 08/03/22.
 */
public class DoublyLinkedList<E> {
    private int size=0;
    private Node<E>header;
    private Node<E>trailer;
    public DoublyLinkedList(){
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);

    }
   public boolean isEmpty()
        {
       return size==0;
        }
        public int size(){
            return size;
        }
        public E first(){
            if(isEmpty())return null;
            return header.getNext().getElment();
        }
    public E lasst(){
        if(isEmpty())return null;
        return trailer.prev.getElment();
    }
    private void addBetween(E el,Node<E>p,Node<E>n){
        Node<E>newest=new Node<E>(el,p,n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }
    public void addFirst(E el){
        addBetween(el,header,header.next);
    }
    public void addLastst(E el){
        addBetween(el,trailer.getPrev(),trailer);
    }
    private E remove(Node<E>x){
        if (isEmpty())return null;
        Node<E>p=x.prev;
        Node<E>n=x.next;
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.elment;
    }
    public E removeFirst(){
        return remove(header.next);
    }
    public E removeLast(){
        return remove(trailer.prev);
    }
    private static class Node<E>
    {
        E elment;
        Node<E>prev;
        Node<E>next;

        public Node(E elment, Node<E> prev, Node<E> next) {
            this.elment = elment;
            this.prev = prev;
            this.next = next;
        }

        public E getElment() {
            return elment;
        }

        public void setElment(E elment) {
            this.elment = elment;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}