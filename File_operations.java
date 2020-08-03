import java.io.*;
//BufferedReader and BufferedWriter can be used for carrying out file i/o faster as 
//it stores the content in its buffer

public class File_operations {

	private String path = "/Users/LAKSHMINATHAN/Desktop/sample.txt";
	
	public void write_to_file()
	{
		FileWriter fw;
		try{
		fw = new FileWriter(path);
		fw.write("We are learning Java");
		fw.close();
		}
		catch(IOException e){
			System.out.println("There was an error " + e);
		}
		append_to_file();
	}
	
	public void append_to_file()
	{
		FileWriter fw;
		//providing true in FileWriter will append to the same file, else even with append
		//function, the file gets replaced with new text
		try{
		fw = new FileWriter(path, true);
		fw.append("\nWe are using javatpoint as reference");
		fw.close();
		}
		catch(IOException e){
			System.out.println("There was an error " + e);
		}
	}
	
	public void read_from_file(){
		System.out.println("Printing values of the file using FileRead");
		FileReader fw;
		try{
			fw = new FileReader(path);
			int character;
			// read functions reads one character at a time from the given file
			while((character=fw.read())!=-1)
			{
//				System.out.println(character);
				System.out.print((char)character);
			}
			}catch(IOException e){
				System.out.println("Error while reading from file " + e);
			}
			
	}
	
	public void buffered_write(){
		BufferedWriter bf_write;
		FileWriter fw;
		char[] write_char = {'n','i','d','h','i',' ', 'i', 's', ' ', 's', 'l','e','e','p','y'};
		try{
			fw = new FileWriter(path, true);
			bf_write = new BufferedWriter(fw);
//			bf_write.write("\n");
			bf_write.write(write_char);
			bf_write.close();
			
		}catch(IOException e){
			System.out.println("Error in buffer write " + e);
		}
		
	}
	
	public void buffered_read(){
		System.out.println("\nPrinting values of the file using bufferedRead");
		BufferedReader bf_read;
		FileReader fr;
		int ascii_value;
		try{
			fr = new FileReader(path);
			bf_read = new BufferedReader(fr);
			while((ascii_value=fr.read())!=-1)
			{
				System.out.print((char)ascii_value);
			}
		}catch(IOException e){
			System.out.println("Error in buffered read " + e);
		}
	}
	public static void main(String[] args) {
		File_operations obj1= new File_operations();
		obj1.write_to_file();
		obj1.read_from_file();
		obj1.buffered_write();
		obj1.buffered_read();
		

	}

}
