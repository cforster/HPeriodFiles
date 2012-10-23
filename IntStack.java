class IntStack
{
    //todo:
    //write resize

    //declarations:
    int[] stack;
    int top=0;

    IntStack(int size)
    {
	stack = new int[size];
    }

    int pop()
    {
	if(isEmpty()) return -1;
	return stack[--top];
    }


    void push(int i)
    {
	stack[top++]=i;
	if(top==stack.length) resize();
    }


    int peek()
    {
	if(isEmpty()) return -1;
	return stack[top-1];
    }

    boolean isEmpty()
    {
	return top==0;
    }

    private void resize()
    {
	int[] newStack = new int[stack.length*2];
	
	for(int i= 0; i< top; i++) {
	    stack[i]=newStack[i];
	}
	 
	//System.out.println("resizing...");
	stack=newStack;
    }


    /*
     * Size
     * gives the current size of the stack.
     * @author Charlie Forster
     */
    int size()
    {
	return top-1;
    }


    /*
     * Mode
     * Gives the number that occurs most often.
     * If given paramater returns the number of times that number occurs in the stack.
     * This is achieved by overloading the method.
     * @author Zachary Buttenwieser
     * @author Adam Phillips
     * @param num
     */

    int mode()
    {
	 int maxValue, maxCount;
	 maxValue = -1;
	 maxCount = -1;
    for (int i = 0; i < stack.length; ++i)
	{
        int count = 0;
        for (int j = 0; j < stack.length; ++j) 
	    {
		if (stack[j] == stack[i]) ++count;
	    }
        if (count > maxCount) {
            maxCount = count;
            maxValue = stack[i];
        }
	}
    return maxValue;
	
    }

    int mode(int num)
    {
	int counter = 0;
	for (int i = 0; i<top; i++)
	    {
		if(stack[i]==num)
		    {
			counter++;
		    }
	    }
	return counter;
	
    }

    double mean()
    {
        double tot=0;
	for(int i=0; i < top; i++)
	    {
		tot += stack[i];
	    }
	tot = tot/top;
	return tot;
    }

    /* 
     * le ginger's work 
     *
     */




}
