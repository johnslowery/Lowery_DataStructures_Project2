//reconfigure this later
public class Priority {
	
	private int maxSize;
	private long[] queArray;
	private int nItems;
	Priority thePQ = new Priority(5);
	
	public Priority(int s)
	{
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long item) // insert item
	{
		int j;
		if(nItems==0)
				queArray[nItems++] = item;
		else
		{
			for(j=nItems-1; j>=0; j--)
			{
				if( item > queArray[j] )
					queArray[j+1] = queArray[j];
				else
					break;
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove()
	{ 
		return queArray[--nItems]; 
	}
	
	public void printQueue() {
		while( !thePQ.isEmpty() )
		{
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
	}
	
	public boolean isEmpty()
	{ 
		return (nItems==0);
	}
	
	public boolean isFull()
	{ 
		return (nItems == maxSize);
	}
	
}
