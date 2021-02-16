//Clase usada para administrar los métodos sin errores de referencia estática a objetos no estáticos
/*
 * Si bien Eclipse me permite crear un archivo module-info.java para administras los módulos,
 * decidí omitirlo debido a unos problemas de importación en el repositorio fairy-game-v2
 */

package core;
import java.io.*;

public class Metodos {
	public int setCycle(int y) throws IOException{ //Método para inicializar el contador de ciclo
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		y=Integer.parseInt(br.readLine());
		return y;
	}
	
	public void pyramidPrinter(int y) {
		for(int i=0; i<y; i++) {
			System.out.println("*");
		}
	}
}
