import java.util.ArrayList;

public class ArrayListGitHub{

	public static ArrayList<Integer> combineArrays(ArrayList<Integer> array1, ArrayList<Integer> array2){
		System.out.println("First Array: " + array1);
		System.out.println("Second Array: " + array2);

		System.out.println();
		ArrayList<Integer> newList = new ArrayList<>(array1);
		newList.addAll(array2);

		return newList;
	}

	public static void printCommaMethod(ArrayList<Integer> list){

		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + ",");
		}

		System.out.println();
	}

	public static void main(String[]args){

		ArrayList<Integer> array1 = new ArrayList<>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);

		ArrayList<Integer> array2 = new ArrayList<>();
		array2.add(6);
		array2.add(7);
		array2.add(8);
		array2.add(9);
		array2.add(10);

		System.out.println("Calling method: Combine Arrays");
		System.out.println(combineArrays(array1, array2));

		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		System.out.println("Calling method: printCommaMethod");
		printCommaMethod(list);



	}
}