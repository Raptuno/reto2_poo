package core;
import java.io.*;

public class Metodos {
	//Inicia Listado de m�todos de la pir�mide
	public int setCycle(int y) throws IOException {
		System.out.print("�De qu� tama�o desea la pir�mide? ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		y=Integer.parseInt(br.readLine());
		return y;
	}
	public void pyramidPrinter(int y) {
		
	}
}
