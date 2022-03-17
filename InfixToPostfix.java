public class InfixToPostfix {

    private String expresion;
    private Stack<Character> stack;
    private int result;

    public InfixToPostfix (String expresion) {
        this.expresion = expresion;
        stack = new ArrayStack<Character>(expresion.length());
    }

    public String convert () {
        String result = "";
        for (int i = 0; i < this.expresion.length(); i++) {
            char c = this.expresion.charAt(i);
//
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ' ') continue;

            else if (Character.isLetterOrDigit(c)) {
                result += c;
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.top() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && !(stack.top() == '(') && Prec(c) <= Prec(stack.top()))
                    result += stack.pop();

                stack.push(c);
            }
        }
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.top() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}