//Clase usada para administrar los m�todos sin errores de referencia est�tica a objetos no est�ticos
/*
 * Si bien Eclipse me permite crear un archivo module-info.java para administras los m�dulos,
 * decid� omitirlo debido a unos problemas de importaci�n en el repositorio fairy-game-v2
 */

package core;
import java.io.*;

public class Metodos {
	public int setCycle(int y) throws IOException{ //M�todo para inicializar el contador de ciclo
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
