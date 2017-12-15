/*
建立一个图形接口，声明一个面积函数。圆形和矩形都实现这个接口，并得出两个图形的面积。
注：体现面向对象的特征，对数值进行判断。用异常处理。不合法的数值要出现“这个数值是非法的”提示，
不再进行运算。
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
			throw new NoValueException("半径值非法");
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
			throw new NoValueException("数值非法");
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