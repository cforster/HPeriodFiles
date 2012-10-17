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

}
