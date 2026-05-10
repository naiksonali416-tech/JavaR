class Sample14{
	public static void main(String[] args)
	{
		int fact=1;
		int no=7;
		for(int i=no; i>=1; i--)
		{
		fact=fact*i;
		}
		System.out.println("factorial of"+no+"is"+fact);
	}
}