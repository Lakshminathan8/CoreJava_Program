import java.util.*;
//Arraylists, Linkedlist, HashMap and Hashtable collections are mostly used

public class collections {
	
	public void display_collection(ArrayList<String> arraylist)
	{
		Iterator<String> list_itr = arraylist.iterator();
		System.out.println("Displaying the collection data. Now the arraylist is: ");
		while(list_itr.hasNext())
		{
			System.out.println("The element in arraylist is " + list_itr.next());
		}
	}

	public void arraylist(){
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Nidhi");
		arraylist1.add("Preeti");
		arraylist1.add("Nidhi");
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println("Deleting an element from arraylist, other elements are moved to left");
		arraylist1.remove(0);
		System.out.println("adding value of index 0,  other elements are moved to right");
		arraylist1.add(0, "Nidhi Changed");
		System.out.println("Sorting the arraylist ");
		Collections.sort(arraylist1);
		display_collection(arraylist1);
//		Iterator list_itr = arraylist1.iterator();
	}
	
	//Linked list type used doubly linked lists internally to store data, advantage over arraylist 
	// the values are not stored in contiguous memory location, hence no need to right/left shifft the data on
	// deletion/addition of values.
	// It can be used as list/ stack or queue
	public void linked_list(){
		System.out.println("\n");
		LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		linkedlist2.add(0);
		
		linkedlist1.add(10);
		linkedlist1.add(20);
		linkedlist2.addAll(linkedlist1);
		Iterator<Integer> linkedlist_itr = linkedlist2.iterator();
		while(linkedlist_itr.hasNext())
		{
			System.out.println("Elements of linkedlist is " + linkedlist_itr.next());
		}
		
		System.out.println("\n Another way to iterate - using for each---");
		for(Integer obj:linkedlist2)
		{
			System.out.println(obj);
		}
		
		System.out.println("\n Another way to iterate - using for loop---");
		for(int i=0; i<linkedlist2.size(); i++){
			System.out.println(linkedlist2.get(i));
		}
		
		System.out.println("\n Another way to iterate - using ListIterator---");
		ListIterator<Integer> int_list_itr= linkedlist2.listIterator(linkedlist1.size()+1);
		while(int_list_itr.hasPrevious())
		{
			System.out.println("Printing from back to front because thats how listiterator works");
			int j = int_list_itr.previous();
			System.out.println(j);
		}
		
		//retainall method will change the value of arraylist1 with common values in arraylist2
	}
	
		public void collection_of_objects()
		{
			System.out.println("\n Storing the objects in arraylist");
			ArrayList<dummy_class> obj_array= new ArrayList<dummy_class>();
			dummy_class obj1= new dummy_class(100, "nidhi", "python basics");
			dummy_class obj2 = new dummy_class(200, "dinesh", "big data advanced");
			obj_array.add(obj1);
			obj_array.add(obj2);
//			for(dummy_class elements:obj_array)
//			{
//				System.out.println("\n The values of the object are " + elements.price + elements.author + elements.title );
//
//			}
			Iterator<dummy_class> obj_itr = obj_array.iterator();
			while(obj_itr.hasNext())
			{
				dummy_class dummy_class_obj = obj_itr.next();
				System.out.println("\n The values of the object are " + dummy_class_obj.price + dummy_class_obj.author + dummy_class_obj.title );
				
			}
	}
	
	public static void main(String[] args) {
		collections obj1 = new collections();
		obj1.arraylist();
		obj1.linked_list();
		obj1.collection_of_objects();
		

	}

}
