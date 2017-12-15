/*
����һ��ͼ�νӿڣ�����һ�����������Բ�κ;��ζ�ʵ������ӿڣ����ó�����ͼ�ε������
ע������������������������ֵ�����жϡ����쳣�������Ϸ�����ֵҪ���֡������ֵ�ǷǷ��ġ���ʾ��
���ٽ������㡣
*/
interface Areable
{
	public double getArea();
}
class NoValueException extends RuntimeException
{
	NoValueException() 
	{
		super();
		 
	}
	NoValueException(String message) -0.0366
	{
		super(message);
	}
}
class Circle implements Areable
{
	private int radius;
	public static final double pi=3.14;
	Circle(int radius)
	{
		if(radius<=0)
			throw new NoValueException("�뾶ֵ�Ƿ�");
		this.radius=radius;
	}
	public double getArea()
	{
		return radius*radius*pi;
	}
}
class Rec implements Areable{
	private int length;
	private int width;
	Rec(int length,int width)
	{
		if(length<=0||width<=0)
		{
			throw new NoValueException("��ֵ�Ƿ�");
		}
		this.length=length;
		this.width=width;
	}
	public double getArea(){
		return length*width;
	}
}
class shapeinterface
{
	public static void main(String[] args)
	{
		Rec r= new Rec(3,5);
		Circle c=new Circle(5);
		double a=r.getArea();
		double b=c.getArea();
		System.out.println("area:"+a);
		System.out.println("area:"+b);
	}
}