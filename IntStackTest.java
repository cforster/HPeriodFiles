class IntStackTest
{
    public static void main(String[] args)
    {
	IntStack is = new IntStack(10);

	System.out.println(is.isEmpty());

	is.push(3);
	is.push(4);
	is.push(5);

	System.out.println(is.mean());


	//Tests for popAall
	System.out.println(is.popAll());
	System.out.println(is.isEmpty());



    }
}
	
