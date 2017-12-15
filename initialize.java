/*
对象初始化过程
1,初始化构造函数，执行父类构造函数，此时没有显示初始化，num=0;
2,父类方法被子类的show()覆盖，执行子类的show();
3,显示初始化执行num=9,接下来构造代码块初始化;
4,最后是子类构造函数的输出
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
		super();//默认执行父类构造函数
		//显示初始化执行num
		//构造代码块初始化
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