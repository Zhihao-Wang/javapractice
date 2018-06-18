/*class ListNode{
    ListNode   next=null;
    int val;
    ListNode(int val){
        this.val=val;
    }
}*/

public class ReverseList {
     public  static ListNode reverselist(ListNode listNode){
        ListNode Rhead=null;
        ListNode now=listNode;
        ListNode pre=null;
        while(now!=null){
            ListNode next=now.next;
            if(next==null){
                Rhead=now;
            }
            now.next=pre;
            pre=now;
            now=next;
        }
        return Rhead;
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
        System.out.println(reverselist(a).val);
    }
}
