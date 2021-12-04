package L17_Dec4;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// create
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		// size : no. of elements which you have added
		System.out.println(list.size());

		// add : insert the element at the end of the list
		// time : constant O(1)
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list);

		System.out.println(list.size());

		// add : you can insert the element at any index
		// range : 0 -> size
		// size index addition : last add, 0 index addition -> front add
		
		// worst case ops : n  elements shift : 0 index add
		// best case ops : 0 element shift : size() index add
		list.add(2, 100);
		System.out.println(list);
		list.add(list.size(), 200);
		System.out.println(list);

		// get
		// range : 0 -> size-1
		// time : constant O(1)
		System.out.println(list.get(2));
		System.out.println(list.get(6));
		System.out.println(list.get(list.size() - 1));

		// set -> update
		// range : 0 -> size-1
		// time : constant O(1)
		list.set(2, 2000);
		System.out.println(list);
		list.set(list.size() - 1, 3000);
		System.out.println(list);

		// remove
		// range : 0 -> size-1
		// worst case ops : n  elements shift : 0 index remove
		// best case ops : 0 element shift : size()-1 index remove
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());

		// arraylist print
		// way 1
		System.out.println(list);

		// way 2
		for (int i = 0; i < list.size(); i = i + 1) {
			System.out.println(list.get(i));
		}
		
		// way 3
		for(int val : list)
			System.out.println(val);

	}

}
