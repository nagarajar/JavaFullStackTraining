package jsp.cfl.maps;
import java.io.*;
public class MapDemo4FileRead 
{
	public static void main(String[] args) throws Exception 
	{
		// how to read a file and display
		/*File f = new File("C:\\Users\\nagar\\Desktop\\Achivements.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		*/
		
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\nagar\\Desktop\\Achivements.txt")));
		String line = " ";
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();

	}

}
