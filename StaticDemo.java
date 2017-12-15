class Demo
{
	int age;
	static int num=9;
	
	public void speak()
	{
		System.out.println(age);
	}
}

class StaticDemo
{
	public static void main(String[] args)
	{
		new Demo().speak();
		System.out.println("Hi");
	}
}