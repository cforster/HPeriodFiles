class IntQueueTester {

    public static void main(String[] args)
    {

	IntQueue iq = new IntQueue(10);

	//base tests for IntQueue:
	iq.put(5);
	iq.put(6);
	iq.put(7);
	iq.put(8);
	System.out.println(iq.get());

	//test for get all 
	int[] dump = iq.getAll();
	for (int i=0; i<dump.length; i++)
	    System.out.print(dump[i] +"-");
    }
}
