import java.util.*;
public class SufflingOfArray {

	public void arrayShuffle(Integer[] array) {

		/*Convert the array to a list */
		List<Integer> l = new ArrayList<>(Arrays.asList(array));

		/* Shuffle the list */
		Collections.shuffle(l);

		/*Convert the shuffled list back to an array if needed else print the list directly*/
		Integer[] shuffledArray = l.toArray(new Integer[0]);

		/* Printing shuffled array using inbuilt class Arrays */
		System.out.println(Arrays.toString(shuffledArray));

		System.out.println("---------------------------------");

		/* Printing the shuffled array using normal for each */
		for (int i : shuffledArray) {
			System.out.print(i + " ");
		}
	}

	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int lenArray = sc.nextInt();
		Integer[] array = new Integer[lenArray];
		System.out.println(String.format("Enter %s elements to add those into an array", lenArray));
		for (int i = 0; i < lenArray; i++) {
			array[i] = sc.nextInt();
		}
		new SufflingOfArray().arrayShuffle(array);
	}
}