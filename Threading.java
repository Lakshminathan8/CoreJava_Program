
//multi-threading using inheritance
public class Threading extends Thread{
		public void run()
		{
			System.out.println("Thread started");
			for(int i=0; i<50; i++)
			{
				System.out.println("The value of i is " + i);
			}
		}

	public static void main(String[] args) {
		Threading obj1=new Threading();
		obj1.start();
		
		for(int j=50; j>=0; j--)
		{
			System.out.println("The j value is " + j);
		}
		// TODO Auto-generated method stub

	}

}
