import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import java.util.Scanner; 



 
public class tokanizer {
	public static void main(String[] args) {
 
		String str = "string separa por espaços HAHAHAHHAHA";
		StringTokenizer st = new StringTokenizer(str);
 
		System.out.println("----------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
 
		System.out.println("---- ------");
		StringTokenizer st2 = new StringTokenizer(str, ";");
 
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	}
}