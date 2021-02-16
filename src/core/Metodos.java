package core;
import java.io.*;

public class Metodos {
	//Inicia Listado de métodos de la pirámide
	public int setCycle(int y) throws IOException {
		System.out.print("¿De qué tamaño desea la pirámide? ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		y=Integer.parseInt(br.readLine());
		return y;
	}
	public void pyramidPrinter(int y) {
		for(int i=0; i>y; i++) {
			for(int j=(y-i); j>1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
