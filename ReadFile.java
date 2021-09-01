package morning1;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 


public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				try 
				{
					File f = new File("f:\\file.txt");
					Scanner myReader = new Scanner(f);
					while (myReader.hasNextLine()) 
					{
						String data = myReader.nextLine();
						System.out.println(data);
					}
				} 
				catch (FileNotFoundException e) 
				{
					System.out.println("  error is occurred.");
					e.printStackTrace();
				}
			}
		 
	}


