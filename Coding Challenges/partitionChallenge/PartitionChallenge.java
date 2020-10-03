package partitionChallenge;

import java.util.*;

/**
 * Partition: Write Code to partition a linked list around a value x, such that
 * all nodes less than x come before all nodes greater than or equal to x. If x
 * is contained within the list, the values of x only need to be after the
 * elements less then x. The partition element x can appear anywhere in the
 * "right partition";
 * 
 * @author chris
 *
 */

public class PartitionChallenge {

	private static LinkedList<Integer> exchangeValues(LinkedList<Integer> n, int pValue) {
		int temp1 = 0;
		int temp2 = 0;
		int[] pArray = new int[n.size()];
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = n.remove();

		}

		for (int i = 0; i < pArray.length - 1; i++) {
			for (int j = i; j < pArray.length; j++) {
				if (pArray[i] == pValue || pArray[i] > pValue) {
					if (pArray[i] >= pArray[j] && pArray[j] != pValue) {
						temp1 = pArray[j];
						pArray[j] = pArray[i];
						pArray[i] = temp1;
					}
				}
			}
		}
		for (int i = 0; i < pArray.length; i++) {

			n.add(pArray[i]);
		}
		return n;

	}

	public static void main(String[] args) {

		Random r = new Random();
		LinkedList<Integer> n = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		int x = 0;
		
		
		System.out.println("Please enter a list size!");
		x = Integer.parseInt(s.nextLine());

		for (int i = 0; i < x; i++) {
			n.add(r.nextInt(100));
		}
		System.out.println("Please enter the number you want to Partition by?");
		x = Integer.parseInt(s.nextLine());
		
		System.out.println(n);
		System.out.println(exchangeValues(n, x));
	}

}
