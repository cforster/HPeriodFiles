class IntQueueTester {

    public static void main(String[] args)
    {

	IntQueue iq = new IntQueue(10);

	//base tests for IntQueue:
	iq.put(5);
	iq.put(6);
	System.out.println(iq.get());
    }
}
