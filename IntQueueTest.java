class IntQueueTest
{
    public static void main(String[] args)
    {
	IntQueue q = new IntQueue(10);

	q.put(5);
	q.put(6);
	q.put(9);
	q.put(1);
	q.put(3);
	q.put(4);

	q.cut(2);

	System.out.println(q.get());

    }
}
