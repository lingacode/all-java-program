import java.io.*;
class FISDemo{
	public static void main(String[] args)
				throws FileNotFoundException,IOException{
				
				FileInputStream fis = new FileInputStream("abc.txt");
				/*int data = fis.read();
				System.out.println("data: "+data);*/
				
				int data;
				while((data = fis.read())!= -1){
					System.out.println("data: " + data);
				}
				fis.close();
	}
}