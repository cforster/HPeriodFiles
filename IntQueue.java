class IntQueue {

    private int[] q;
    private int front=0;
    private int back=0;


    public IntQueue(int size)
    {
	q = new int[size];
    }

    void put(int i){
	q[back]=i;
	back= (back+1)%q.length;
	if(front==back) resize();
    }

    int get() {
	int temp = q[front];
	front = (front+1)%q.length;
	return temp;
    }

    boolean isEmpty()
    {
	return front==back;
    }

    private void resize()
    {
	//to be completed
    }
    int size()
    {
	return Math.abs(front-back);
    }

   /*
    * getAll
    * gets the entire queue
    * @author Allegra Simon and Alex Fisher
    */

    int[] getAll()
	{
	    int[] fullQueue = new int[this.size()];

	    for(int i=0; i<this.size(); i++)
		{
			
			fullQueue[i] = q[i];
			this.get();
		}

		return fullQueue;
	}
    /*
     *Casey, Rachel
     *Converts queue to a string
     */
    String convertString()
    {
	String s = "";

	//go through the whole array
	//    add  it to s

       	if(front < back)
	{
	    for(int i=front; i<back; i++) {
		s+=q[i];
	    }
	  
	 }
	else if (back < front)
	    {
		for(int i=front; i<q.length; i++) {
		    s+=q[i];
		}
		for (int i=0; i<back; i++){
		    s+=q[i];
		}
	 
	    }
	
	return s;
    }
}
