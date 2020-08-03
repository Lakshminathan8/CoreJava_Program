
public class Arrays {
	//static array
	int arraynew[] = {1,2,3,4};
	
	//dynamic array
	int array1[] = new int[10];
	
	//define array
	public void assign_array_values()
	{
	for(int i=0; i<array1.length; i++)
	{
		if(i==0){
			array1[i] = 2;
		}
		else{
		array1[i] = array1[i-1] + 2;
		}
	}
	}
	
	//for-each loop in java array
	public void for_eachloop()
	{
		System.out.println("\n");
		for(int k:array1)
		{
			/* displays 0 as value of array in each index is initialized to 0 
			when array is initialized */
			//k represents array1[index]
			System.out.println(k);
		}
	}
	//display array
	public void display_array_values()
	{
		System.out.println("\n Array1 has these values");
		for(int j=0; j<array1.length; j++)
		{
			System.out.println("The array in index " + j + "is " + array1[j]);
		}
	}
	
	//Getting array as args
	public void get_array(int array_temp[]){
		System.out.println("Getting array values as args");
		for(int l=0; l<array_temp.length; l++){
			System.out.println(array_temp[l]);
		}
		
	}
	
	//Returning array from method
	public char[] return_array()
	{
		char char_array[] = {'d', 'i', 'n', 'e', 's', 'h'};
		return char_array;
	}
	
	//ArrayIndexOutOfBound Exception
	public void display_error()
	{
		System.out.println("\n Array1 has these values - will throw error");
		try{
			for(int j=0; j<=array1.length; j++)
			{
				System.out.println("The array in index " + j + "is " + array1[j]);
			}
		}
		catch(ArrayIndexOutOfBoundsException err){System.out.println("Array error - " + err);
		}
	}
	
	//copying an array
	public void copy_int_array()
	{
		int fromarray[] = {5,10,15,20};
		int toarray[] = new int[3];
		System.arraycopy(fromarray, 0, toarray, 0, 3);
		get_array(fromarray);
		get_array(toarray);
		
	}
	
	
	//cloning an array
	//Cloning 1 dimensional array will create deep copy of the original array
	//Cloning multi-dimensional array will create shallow copy of the original array
	public void clone_int_array()
	{
		int fromarr[] = {1,2,3,4};
		int toarr[] = new int[4];
		toarr = fromarr.clone();
		System.out.println("Cloned from");
		get_array(fromarr);
		System.out.println("Cloned to");
		get_array(toarr);
	}
	
	public static void main(String[] args) {
//		Arrays obj1 = new Arrays();
//		obj1.assign_array_values();
//		obj1.display_array_values();
//		obj1.for_eachloop();
//		
//		Arrays obj2 = new Arrays();
//		obj2.for_eachloop();
//		obj2.display_array_values();
//		
//		Arrays obj3 = new Arrays();
//		//Anonymous arrays
//		obj3.get_array(new char[]{'n', 'i', 'd', 'h', 'i'});
//		
//		Arrays obj4 = new Arrays();
//		char[] hubby = obj4.return_array();
//		obj4.get_array(hubby);
		
//		Arrays obj5 = new Arrays();
//		obj5.assign_array_values();
//		obj5.display_error();
		
//		Arrays obj6 = new Arrays();
//		obj6.copy_int_array();
		
		Arrays obj7 = new Arrays();
		obj7.clone_int_array();

	}

}
