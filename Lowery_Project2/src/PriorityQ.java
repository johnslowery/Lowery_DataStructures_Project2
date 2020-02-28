
public class PriorityQ {
	
	private static int maxSize;
	private static Country[] queArray;
	private static int nItems;
	static PriorityQ thePQ = new PriorityQ(155);
	
	public PriorityQ(int s)
	{
		maxSize = s;
		queArray = new Country[maxSize];
		nItems = 0;
	}
	
	public void insert(Country item)
	{
		int j;
		if(nItems == 0)
				queArray[nItems++] = item;
		else
		{
			for(j = nItems-1; j >= 0; j--)
			{
				if((item.getGDP() / item.getPop()) < (queArray[j].getGDP() / queArray[j].getPop()))
					queArray[j + 1] = queArray[j];
				else
					break;
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}
	
	public Country remove()
	{
		return queArray[--nItems]; 
	}
	
	public void printQueue() {
		while(!thePQ.isEmpty())
		{
			Country item = thePQ.remove();
			System.out.print(item.getName() + " ");
		}
	}
	
	public boolean isEmpty()
	{ 
		return (nItems == 0);
	}
	
	public boolean isFull()
	{ 
		return (nItems == maxSize);
	}
	
}
