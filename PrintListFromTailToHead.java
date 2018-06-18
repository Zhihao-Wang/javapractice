
import java.util.Stack;

class ListNode{
    ListNode next=null;
    int val;
    ListNode(int val){
        this.val=val;
    }

}
public class PrintListFromTailToHead {
    public static  void printListFromTailToHead(ListNode listnode){
        Stack<Integer> stack=new Stack<>();
        while(listnode!=null){
            stack.push(listnode.val);
            listnode=listnode.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode e=new ListNode(4);
        ListNode f=new ListNode(5);
        ListNode g=new ListNode(6);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.next=g;
        printListFromTailToHead(a);

    }
}
