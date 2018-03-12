class ListNode1{
    int data;
    ListNode1 next;

    ListNode1(int x){
        data=x;
        next=null;
    }
}

public class ListNodeFromLast {


        public ListNode1 FindLastK(ListNode1 head,int k){
            if(head==null||k<0)
                return null;
            ListNode1 ANode=head;
            ListNode1 BNode=null;

            for(int i=0;i<k-1;i++){
                if(ANode!=null)
                    ANode=ANode.next;
                else
                    return null;
            }
            BNode=head;
            while(ANode.next!=null){
                ANode=ANode.next;
                BNode=BNode.next;
            }
            return BNode;
        }

        public static void main(String[] args){
            ListNode1 a=new ListNode1(1);
            ListNode1 b=new ListNode1(2);
            ListNode1 c=new ListNode1(3);
            ListNode1 d=new ListNode1(4);
            a.next=b;
            b.next=c;
            c.next=d;

            ListNodeFromLast ln=new ListNodeFromLast();
            ListNode1 result=ln.FindLastK(a,3);
            System.out.println(result.data);
        }
    }


