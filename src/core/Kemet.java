package core;
import java.io.*;

public class Kemet {
	
	public static void pPrinter(int limiter) {
		for(int i=0; i<limiter; i++) {
			for(int j=limiter-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		boolean reset=true;
		
		while(reset){
			System.out.println(
					"Opciones disponibles: "
					+"\t1. Imprimir pirámide"
					+"\t2. Taquilla"
					+"\t3. Salir"
					);
			System.out.print("¿Qué desea hacer? ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			switch(br.readLine().toLowerCase().charAt(0)) {
			case 'i':
				System.out.print("¿De qué tamaño desea la pirámide? ");
				BufferedReader pNum=new BufferedReader(new InputStreamReader(System.in));
				pPrinter(Integer.parseInt(pNum.readLine()));
				break;
			case 't':
				System.out.println();
				break;
			case 's':
				reset=false;
			}
		}
	}
}
