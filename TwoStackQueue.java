//两个栈实现一个队列
import java.util.Stack;

public class TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void add(int value) {
        stackPush.push(value);
    }

    public void shiftStacks() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public int peek() {
        shiftStacks();
        return stackPop.peek();
    }

    public int poll() {
        shiftStacks();
        return stackPop.pop();
    }

    public static void main(String[] args) {
        TwoStackQueue q = new TwoStackQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());

    }
}
