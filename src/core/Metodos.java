package core;
import java.io.*;

public class Metodos {
	//Inicia Listado de m�todos de la pir�mide
	public void pyramidPrinter(int y) {
		for(int i=0; i>y; i++) {
			for(int j=(y-i); j>1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
