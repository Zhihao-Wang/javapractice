import java.util.Scanner;

class numberpn{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num=1;
		int countP=0;
		int countN=0;
		while(num!=0)
		{
			System.out.println("������һ������:");
			num=sc.nextInt();
			
			if(num>0){
				countP++;
			}
			else if(num<0){
				countN++;
			} 
			System.out.println("��������Ϊ:"+countP+","+"��������Ϊ:"+countN);
		}
	}
}