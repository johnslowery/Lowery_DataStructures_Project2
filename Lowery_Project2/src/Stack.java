
public class Stack {
	
	private static int maxSize;
	private static Country[] stackArray;
	private static int top; 
	static Stack theStack = new Stack(155);
	
	public Stack(int s)
	{
		maxSize = s;
		stackArray = new Country[maxSize];
		top = -1;
	}
	
	public void push(Country j)
	{
		stackArray[++top] = j;
	}

	public Country pop()
	{
		return stackArray[top--];
	}
	
	public void printStack() 
	{
		while(!theStack.isEmpty())
		{
			Country value = theStack.pop();
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
