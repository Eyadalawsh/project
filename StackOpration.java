public class StackOpration {
    public static void transfer(Stack s, Stack t) {
        while (!s.isEmpty())
            t.push(s.pop());
    }

    public static void empty(Stack stack) {
        if(!stack.isEmpty()) {
            stack.pop();
            empty(stack);
        }
    }
}