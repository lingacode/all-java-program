import java.io.*;

class FOSDemo{
	public static void main(String[] args)
				throws FileNotFoundException , IOException{
					FileOutputStream fos = new FileOutputStream("bbc.txt");
					
					fos.write(5);
					System.out.println("data is saved");
					fos.close();
					
	}
}
				