import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class plus{
    public static void main(String args[]) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            if(n > 1000000) {
                System.out.println("�Է°��� 1,000,000 �Ѿ����ϴ�.");
                return;
            }
            for(int i=0; i<n; i++) {
                String[] word = br.readLine().split(" ");
                if(Integer.parseInt(word[0]) < 0 || Integer.parseInt(word[0]) > 1000 
                        || Integer.parseInt(word[1]) < 0 || Integer.parseInt(word[1]) > 1000) {
                    System.out.println("�������� ���ڴ� 0~1000������ �����Դϴ�.");
                    return;
                }
                bw.write(Integer.parseInt(word[0])+Integer.parseInt(word[1])+"\n");
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}

