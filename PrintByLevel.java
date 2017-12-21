//二叉树按层打印，一层输出在一行
public class Node{
	private int value;
	private Node left;
	private Node right;
	
	public Node(int data){
		this.value=data;
	}
} 

public void PrintByLevel(Node head){
	if(head==null){
		return;
	}
	Queue<Node> queue =new LinkedList<Node>();
	int level;
	Node last=head;
	Node nlast=null;
	queue.offer(head);
	System.out.print("level"+(level++)+":");
	while(!queue.isEmpty()){
	head=queue.poll();
	System.out.println(head.value+" ");
	if(head.left!=null){
		queue.offer(head.left);
		nlast=head.left;
	}
	if(head.right!=null){
		queue.offer(head.right);
		nlast=head.right;
	}
	if(head=last&&!queue.isEmpty()){
		System.out.println("\nlevel"+(level++)+":");
		last=nlast;
	}
	
	}
	System.out.println();
}