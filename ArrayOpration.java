
        import java.util.Arrays;
        import java.util.Scanner;

public class ArrayOpration {
    public static void main (String[] args) {
//        int[] x = {1,2,3,4,5};
//        System.out.println("The Array Element:");
//        System.out.println(Arrays.toString(x));
//
//        System.out.println("The Reverse Array Is:");
//        System.out.println(Arrays.toString(reverse(x)));
//
//        System.out.println("The Rotate Left Array Is:");
//        System.out.println(Arrays.toString(rotateLeft(x)));
//
//        System.out.println("The Rotate Right Array Is:");
//        System.out.println(Arrays.toString(rotateRight(x)));

        ArraysOpration myArray = new ArraysOpration();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the elements: ");
        for (int i = 0; i < 7 ; i++) {
            if(myArray.addSortedElement(input.nextInt())) {
                System.out.println("Added");
            } else {
                System.out.println("Is Full");
            }

            System.out.println(Arrays.toString(myArray.getArray()));
        }

//        for (int i = 0; i < 3 ; i++) {
//            if(myArray.deleteLastElement()) {
//                System.out.println("Deleted");
//            } else {
//                System.out.println("Is Empty");
//            }
//
//            System.out.println(Arrays.toString(myArray.getArray()));
//        }
        for (int i = 0; i < 3 ; i++) {
            System.out.print("What is the number want to find the index: ");
            int number = input.nextInt();
            int index = myArray.indexOf(number);
            if(index != -1) {
                System.out.println(index);
            } else {
                System.out.println("The element is not in the array");
            }

            System.out.println(Arrays.toString(myArray.getArray()));
        }

    }

    public static int[] reverse(int[] array) {
        int n = array.length-1;
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
            n--;
        }
        return array;
    }

    public static int[] rotateLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++)
            array[i] = array[i+1];

        array[array.length-1] = temp;

        return array;
    }

    public static int[] rotateRight(int[] array) {
        int temp = array[array.length-1];
        for (int i = array.length-1; i > 0; i--)
            array[i] = array[i-1];

        array[0] = temp;

        return array;
    }
}
