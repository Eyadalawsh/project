import java.util.Scanner;

/**
 * Created by Arabic on 01/02/22.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> myQueue=new ArrayQueue<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("input Q element");
        for (int i = 0; i <5; i++) {
            myQueue.enQueue(in.next().charAt(0));
            System.out.println("the frist "+myQueue.frist());
            System.out.println("the size "+myQueue.size());

        }
        while (!myQueue.isEmpty())
        {
            System.out.print(myQueue.dequeue()+"\t");
        }
    }
}
