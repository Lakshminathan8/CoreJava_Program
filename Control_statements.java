
public class Control_statements {
	
	public void for_loop(){
		int i;
		System.out.println("\n Performing for loop");
		for(i=0; i<10; i++) //Performing for loop
		{
			if(i==5){
				System.out.println("Reached midpoint -" + i + "- Skipping this iteration");
				continue;
			}
			System.out.println("The value is changing to " + i);
			
		}
		
	}
	
	public void while_loop(){
		int j=10;
		System.out.println("\n Performing while loop");
		/* Performing while loop */
		while(j>0)
		{
			if(j==5){
				System.out.println("Reached the midpoint -" + j + "- Breaking \n");
				break;
			}
			System.out.println("The value of j is changing to " + j);
			j--;
			
		}
		
	}
	
	
	public void do_while(){
		/**
		 * 
		 */
		int k=-1;
		System.out.println("\n Performing do while loop");
		do{
			k++;
			System.out.println("The value of k is changing to " + k);
		}while(k<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control_statements loop_obj = new Control_statements();
		loop_obj.for_loop();
		loop_obj.while_loop();
		loop_obj.do_while();
	}
}
