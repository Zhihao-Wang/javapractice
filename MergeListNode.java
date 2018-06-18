public class MergeListNode {
    static ListNode Merge(ListNode head1,ListNode head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        ListNode Mhead=null;
        if(head1.val<head2.val){
            Mhead=head1;
            Mhead.next=Merge(head1.next,head2);
        }
        else{
            Mhead=head2;
            Mhead.next=Merge(head1,head2.next);
        }
        return Mhead;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode e=new ListNode(4);
        ListNode f=new ListNode(5);
        ListNode g=new ListNode(6);
        a.next=c;
        b.next=e;
        c.next=f;
        e.next=g;
        System.out.println(Merge(a,b).val);
    }
}
