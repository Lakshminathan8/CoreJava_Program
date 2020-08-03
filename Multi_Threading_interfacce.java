//Implementing multi-threading using interface

public class Multi_Threading_interfacce implements Runnable{
	public void run()
	{
		System.out.println("Thread started");
		for(int i=0; i<=10; i++)
		{
			System.out.println("Thread i value " + i);
		}
	}

	public static void main(String[] args) {
		Multi_Threading_interfacce obj1 = new Multi_Threading_interfacce();
		Thread t1 = new Thread(obj1);
		t1.start();
		for(int j=10; j>0; j--)
		{
			System.out.println("The j value is " + j);
		}
	}
}
