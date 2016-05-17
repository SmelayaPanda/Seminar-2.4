package command;

import java.util.Stack;

public class DIF implements Cmd {
    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        if (stack.size() >= 2) {
            Double v = stack.pop() - stack.pop();
            System.out.println("difference -> " + v);
            stack.push(v);
        } else {
            System.err.println("Stack haven't two values".toUpperCase());
        }
        return stack;
    }
}
