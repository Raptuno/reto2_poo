package core;
import java.io.*;

public class Kemet {
	public static void main(String[] args) throws IOException {
		Metodos m=new Metodos();
		
		System.out.println("¿De qué tamaño desea la pirámide? ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cycle=Integer.parseInt(br.readLine());
				
		m.pyramidPrinter(cycle);
	}
}
