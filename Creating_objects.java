
public class Creating_objects implements Cloneable{
	int emp_id;
	String emp_name;
	int emp_age;
	
	public void initialize_class_variables(int i, String name)
	{
		emp_id = i;
		emp_name = name;
	}
	
//	public void initialize_class_variables(int i, String name)
//	{
//		this.emp_id = i;
//		this.emp_name = name;
//	}
	
	//default_constructor - a similar constructor gets executed if a constructor is not written
	Creating_objects(){
		System.out.println("Executing default constructor");
		emp_id =0;
		emp_name=null;
		
	}
	
	Creating_objects(int i, String str_name){
		System.out.println("Executing parametrised constructor");
		emp_id = i;
		emp_name = str_name;
	}
	
	Creating_objects(int i, String str_name, int age){
		System.out.println("Executing parametrised constructor");
		emp_id = i;
		emp_name = str_name;
		emp_age = age;
	}
	
	Creating_objects(Creating_objects test_obj){
		emp_id = test_obj.emp_id;
		emp_name = test_obj.emp_name;
		emp_age = test_obj.emp_age;
	}
	
	public void display_variables()
	{
//		System.out.println("\n");
		System.out.println("The value of emp id is " + emp_id);
		System.out.println("The value of emp name is " + emp_name);
		System.out.println("The value of emp age is " + emp_age);
	}
	
	//throws is used for the progrmmer to know that an exception may be expected
	//syntax- return type function_name throws exception {what to do when exception occurs}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating objects using new keywords - classname objname = new classname()
		Creating_objects obj1 = new Creating_objects(); 
		obj1.emp_id = 01;
		obj1.emp_name = "nidhi";
		obj1.display_variables();
		
		//Creating anonymous objects
		System.out.println("\n");
		new Creating_objects().emp_id = 02;
		new Creating_objects().emp_name = "anitha";
		new Creating_objects().display_variables();
		
		//Creating multiple objects using one type
		System.out.println("\n");
		Creating_objects obj3 = new Creating_objects(), obj4 = new Creating_objects();
		obj3.emp_id = 03;
		obj4.emp_id = 04;
		obj3.display_variables();
		obj4.display_variables();
		
		
		//Creating objects and initializing using methods
		System.out.println("\n");
		Creating_objects obj5= new Creating_objects();
		obj5.initialize_class_variables(05, "lakshman");
		obj5.display_variables();
		
		//Using default constructor
		System.out.println("\n");
		Creating_objects obj6 = new Creating_objects();
		obj6.display_variables();
		
		//Using parametrised constructor - 2 agrgs (constructor overloading)
		System.out.println("\n");
		Creating_objects obj7 = new Creating_objects(7, "madhi");
		obj7.display_variables();
				
		//Using parametrised constructor - 3 args (constructor overloading)
		System.out.println("\n");
		Creating_objects obj8 = new Creating_objects(7, "preeti", 29);
		obj8.display_variables();
		
		/*Copy constructor is generally used to copy contents of one object to another object
		This is not available in java, but we can copy the value of one object to another using following 2 methods*/
		
		/*Assigning the obj1 = obj2 will lead to both objects pointing to the same location, 
		so that any change made in obj1 will be reflected in obj2- this is "shallow copy"*/
		System.out.println("\n");
		Creating_objects obj9 = new Creating_objects();
		obj9 = obj8;
		obj9.emp_name = "changed_name";
		obj9.display_variables();
		obj8.display_variables();
		
		//using constructor - copying the values of obj8 to obj9
		System.out.println("\n");
		Creating_objects obj10 = new Creating_objects(obj9);
		obj10.display_variables();
		
		//using the object's values without constructor
		System.out.println("\n");
		Creating_objects obj11 = new Creating_objects();
		obj11.emp_id = obj10.emp_id;
		obj11.emp_name = obj10.emp_name;
		obj11.emp_age = obj10.emp_age;
		obj11.display_variables();
		
		//using clone method
		try{
		System.out.println("\n");
		Creating_objects obj12 = new Creating_objects();
		obj12 = (Creating_objects)obj11.clone();
		obj12.display_variables();
		obj12.emp_name = "changed_name_again";
		obj12.display_variables();
		obj11.display_variables();}
		catch(CloneNotSupportedException c){}
	}

}
