//Herarchical inheritance
class Sample3
{
	int a=20;
}
class Demo3 extends Sample3
{
	void test()
	{
		System.out.println("i am test....");
	}
}
class Tester3 extends Sample3
{
	void po()
	{
    System.out.println("i am poo....");
	}
}



class Mainclass3 
{
	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		System.out.println(d3.a);
		d3.test();
		Tester3 t3=new Tester3();
		System.out.println(t3.a);
		t3.po();
	}
}
