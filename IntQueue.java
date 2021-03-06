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

    int[] get(int x)
    {
	int[] mini = new int[x];
	int counter=0;
	while(counter<x)
	    {
		mini[counter++]= this.get();
		
	    }
	return mini;
    }

    /*
     *Subque
     *Allows the user to create a subque.
     *@author Zachary Buttenwieser
     *@author Adam Phillips
     *@param s the place you want to start
     *@param e the place you want to end
     */

    public Queue subQ(int s, int e) {
	IntQueue subQ = new IntQueue();
	if(s<e){
	    for (int i = s; i < e; i++){
		subQ.put(q[i]);
	    }
	}
	else if (s> e ) {
	    for (int i = s; i < q.length; i++) {
		subQ.put(q[i]);
	    }
	    for (int i = 0; i < e; i++) {
		subQ.put(q[i]);
	    }
	}
	return subQ;
    }

/*
 * Pop X number of ints
 * Ask for X
 * Run pop X number of times
 * Move the popped ints into new array
 * return new array
 * @author James Shao
 * @author Ben Ginzberg
 */

   public int[] popX(int x)
{
   int[] getX = new int[x]; //set return array length to equal number of items popped


   for(int i=0; i<x; i++) //run loop x number of times
	{
	    getX[i]=q[i]; //put pop int into return array
	    this.get();
	}

    return getX;
}
    

}
