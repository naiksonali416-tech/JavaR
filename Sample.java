class Sample{
	int c=10;
}
class Demo1 extends Sample{
	void test(){
	System.out.println("its test....");
	}
}
class MainClass1{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		System.out.println(d1.c);
	}
}