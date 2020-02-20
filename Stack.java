//reconfigure this later
public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top; 
	
	public Stack(int s)
	{
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long j)
	{
		stackArray[++top] = j;
	}

	public long pop()
	{
		return stackArray[top--];
	}
	
	public void printStack() 
	{
		Stack theStack = new Stack(10);
		while(!theStack.isEmpty())
		{
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		} 
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
	

}