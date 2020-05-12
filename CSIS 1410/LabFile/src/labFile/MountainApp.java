package labFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MountainApp {
	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<>();
		try (Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))) {
			
			while(reader.hasNextLine()) {
			Mountain dude = getMountain(reader.nextLine());
			
			if(dude != null) {
				mountainList.add(dude);
				
			}
			}
			
			for(Mountain m: mountainList){
				System.out.println(m);
			}
		}

	}

	/**
	 * METHOD-
	 *@param nextLine
	 */
	private static Mountain getMountain(String nextLine) {
		String[] i;
		try {
			i = nextLine.split(",");
			return new Mountain(i[0], Integer.parseInt(i[1]), Boolean.parseBoolean(i[2]));
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
		System.err.println(nextLine +"...Could not be read as a Mountain");
			return null;
		}
		
		
		
	}
}
