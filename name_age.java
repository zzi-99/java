
import java.io.*;

public class name_age {

	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String []name = new String[3];
			int []age = new int[3];
			
			for(int i=0; i<3; i++) {
				System.out.print("�̸� : ");	name[i] = br.readLine();
				System.out.print("���� : ");	age[i] = Integer.parseInt(br.readLine());
				System.out.println();
			}
			
			for(int i=0; i<3; i++) {
				System.out.printf("%-5s\t%d��\n", name[i], age[i]);
			}
		}
	}

