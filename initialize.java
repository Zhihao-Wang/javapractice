/*
�����ʼ������
1,��ʼ�����캯����ִ�и��๹�캯������ʱû����ʾ��ʼ����num=0;
2,���෽���������show()���ǣ�ִ�������show();
3,��ʾ��ʼ��ִ��num=9,���������������ʼ��;
4,��������๹�캯�������
*/

class Fu{
	Fu()
	{
		System.out.println("fu constructor run");
		show();
	}
	void show()
	{
		System.out.println("hehe");
	}
}
class Zi extends Fu
{
	int num=9;
	{
		System.out.println("constructor code..."+num);
		num=10;
	}
	
	Zi()
	{
		super();//Ĭ��ִ�и��๹�캯��
		//��ʾ��ʼ��ִ��num
		//���������ʼ��
		System.out.println("zi constructor.."+num);
		
	}
	void show()
	{
		System.out.println("show..."+num);
	}
}

class initialize
{
	public static void main(String[] args)
	{
		new Zi();
	}
}