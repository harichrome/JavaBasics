import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader in=null;
		FileWriter out=null;
		
		try {
			
			in= new FileReader("C:\\snairWorkspace\\input.txt");
			out=new FileWriter("C:\\snairWorkspace\\output.txt");
			
			int c;
			while ((c=in.read()) != -1) {
				out.write(c);
			}
			
					
		}
		
		finally{
			if (in != null){
				in.close();
			}
			if (out !=null) {
				out.close();
			}
			
		}
	}

}
