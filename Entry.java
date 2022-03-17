public class Entry {
    public static void main (String[] args) {
//        Stack<String> stack1 = new ArrayStack<String>(5);
//        Stack<String> stack2 = new ArrayStack<String>(5);
//
//        stack1.push("Mohammed");
//        stack1.push("Ali");
//        stack1.push("Waled");
//        stack1.push("Salah");
//
//        StackOpration.transfer(stack1, stack2);
//
//        System.out.println(stack2.top());
//        stack2.pop();
//        System.out.println(stack2.top());
//        stack2.pop();
//        System.out.println(stack2.top());
//        stack2.pop();
//        System.out.println(stack2.top());
//        stack2.pop();
//
//        stack1.push("Mohammed");
//        stack1.push("Ali");
//        stack1.push("Waled");
//        stack1.push("Salah");
//
//        System.out.println(stack1.size());
//        StackOpration.empty(stack1);
//        System.out.println(stack1.size());

        InfixToPostfix infix = new InfixToPostfix("(A/(B-C+D))*(E-A)*C") ;
        String res = infix.convert();
        System.out.println(res);
    }

}