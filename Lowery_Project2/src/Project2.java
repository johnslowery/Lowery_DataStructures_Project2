import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Project2 {
	
	static Stack theStack = new Stack(155);
	static Country helper;
	public static void main(String[] args) throws FileNotFoundException {
		PriorityQ poorQueue = new PriorityQ(155);
		PriorityQ fairQueue = new PriorityQ(155);
		//Priority goodQueue = new Priority(155);
		//Priority veryGoodQueue = new Priority(155);
		//Priority excellentQueue = new Priority(155);
		//Scanner input = new Scanner(System.in);
		//String fileTest = input.nextLine();
		File countryInfo = new File("Countries2.csv");
		Scanner sc = new Scanner(countryInfo);
		sc.nextLine();
		sc.useDelimiter(",|\n");
		Country[] fileInfo = new Country[155];
		for(int x = 0; x < 155; x++) {
			fileInfo[x] = new Country();
			fileInfo[x].setName(sc.next());
			fileInfo[x].setCode(sc.next());
			fileInfo[x].setCapitol(sc.next());
			fileInfo[x].setPop(Integer.parseInt(sc.next()));
			fileInfo[x].setGDP(Double.parseDouble(sc.next()));
			fileInfo[x].setHapp(sc.next());
			double gdp = fileInfo[x].getGDP();
			int pop = fileInfo[x].getPop();
			int gdpCap = (int) (gdp / pop);
			if(gdpCap < 1000) {
				poorQueue.insert(fileInfo[x]);
			}
			/*else if(gdpCap >= 1000 && gdpCap < 5000) {
				fairQueue.insert(fileInfo[x]);
			}
			/*else if(gdpCap >= 5000 && gdpCap < 20000) {
				goodQueue.insert(gdpCap);
			} 
			else if(gdpCap >= 20000 && gdpCap < 50000) {
				veryGoodQueue.insert(gdpCap);
			} 
			else if(gdpCap >= 50000) {
				excellentQueue.insert(gdpCap);
			}*/
		}
		poorQueue.printQueue();
		System.out.println();
		fairQueue.printQueue();
		//goodQueue.printQueue();
		//veryGoodQueue.printQueue();
		//excellentQueue.printQueue();
		/*while(!poorQueue.isEmpty()) {
		  	helper = poorQueue.remove();
			theStack.push(helper);
		}
		while(!fairQueue.isEmpty()) {
			helper = fairQueue.remove();
			theStack.push(helper);
		}/*
		while(!goodQueue.isEmpty()) {
			helper = goodQueue.remove();
			theStack.push(helper);
		}
		while(!veryGoodQueue.isEmpty()) {
			helper = veryGoodQueue.remove();
			theStack.push(helper);
		}
		while(!excellentQueue.isEmpty()) {
			helper = excellentQueue.remove();
			theStack.push(helper);
		}
		theStack.printStack();*/
	}
}