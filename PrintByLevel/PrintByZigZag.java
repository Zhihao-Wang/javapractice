package PrintByLevel;


import java.util.Deque;
import java.util.LinkedList;

public class PrintByZigZag {
    public void printByZigZag(Node head) {
        if (head == null) {
            return;
        }
        Deque<Node> dq = new LinkedList<Node>();
        int level = 1;
        boolean lr = true;
        Node last = head;
        Node nlast = null;
        dq.offerFirst(head);
//        printLevelandOrientation(level++, lr);
        while (!dq.isEmpty()) {
            if (lr) {
                head = dq.pollFirst();
                if (head.left != null) {
                    nlast = nlast == null ? head.left : nlast;
                    dq.offerLast(head.left);
                }
                if (head.right != null) {
                    nlast = nlast == null ? head.right : nlast;
                    dq.offerLast(head.right);

                }
                else {
                    head = dq.pollLast();
                    if (head.right != null) {
                        nlast = nlast == null ? head.right : nlast;
                        dq.offerFirst(head.right);
                    }
                    if (head.left != null) {
                        nlast = nlast == null ? head.left : nlast;
                        dq.offerFirst(head.left);
                    }
                }
            }
            System.out.println(head.value + " ");
            if (head == last && !dq.isEmpty()) {
                    lr = !lr;
                    last = nlast;
                    nlast = null;
                    System.out.println();
            }
            System.out.println();
        }

    }

//    public void printLevelandOrientation(int level, boolean lr) {
//        System.out.println("level" + level + "from");
//        System.out.println(lr ? "left to right" : "right to left");
//    }
}
