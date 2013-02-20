

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


    //test queue pop
        System.out.println("How many pops? (no scanner, just saying for example, 3 pops)");
        System.out.println(popX(3));

    }
}
