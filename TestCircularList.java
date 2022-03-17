import java.util.Scanner;

/**
 * Created by LAB on 3/1/2022.
 */
public class TestCircularList {
    public static void main(String[] args) {
        CircularlyLinkedList<String>list= new CircularlyLinkedList<>();
        Scanner in= new Scanner(System.in);
        System.out.println("1 add first\t2 add last\t3 rotate\t4 remove first\t0 exit");
        int choice=-1;
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {case 0:
                System.exit(0);
                break;
                case 1:
                    System.out.println("input a name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input a name");
                    list.addLast(in.next());
                    break;
                case 3:
                    list.rotate();
                    break;
                case 4:
                    System.out.println("removed is "+list.removeFirst());
                    break;
            }
            System.out.println("first= "+list.first()+"\tlast= "+list.last()+"\t size= "+list.size());
        }
    }
}
