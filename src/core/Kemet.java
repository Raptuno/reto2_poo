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
	
	public static void boFunction() throws IOException { //Función de Taquilla
		int aToll=100;
		int nbToll=aToll-30;
		int iToll=aToll-50;
		
		System.out.println(
				"Tipos de tarifa: "
				+"\n\t1. Adulto: $"+aToll
				+"\n\t2. Niño o adulto mayor normal: $"+nbToll
				+"\n\t3. Adulto Mayor INAPAM: $"+iToll
				);
		System.out.print("Seleccione una tarifa: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		switch(br.readLine().toLowerCase().charAt(0)) {
		case 'a':
			System.out.println("Precio: "+aToll);
			break;
		case 'n':
			System.out.println("Precio: "+nbToll);
			break;
		case 'i':
			System.out.println("Precio: "+iToll);
			break;
		case 'b':
			System.out.println("Precio. $"+nbToll);
			break;
		}
	}
	
	public static void main(String[] args) throws IOException {
		boolean reset=true;
		
		while(reset){
			System.out.println(
					"Opciones disponibles: "
					+"\n\t1. Imprimir pirámide"
					+"\n\t2. Taquilla"
					+"\n\t3. Salir"
					);
			System.out.print("¿Qué desea hacer? ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			switch(br.readLine().toLowerCase().charAt(0)) {
			case 'i':
				System.out.print("¿De qué tamaño desea la pirámide? ");
				BufferedReader pNum=new BufferedReader(new InputStreamReader(System.in));
				int cycle=Integer.parseInt(pNum.readLine());
				if(cycle>=3) {
					pPrinter(cycle);
				} else {
					System.out.println("Se requieren 3 o más asteriscos");
				}
				break;
			case 't':
				boolean boLoop=true;
				
				while(boLoop) {
					boFunction();
					System.out.print("¿Ingresar otro boleto? ");
					BufferedReader boLoopC=new BufferedReader(new InputStreamReader(System.in));
					
					confirm: switch(boLoopC.readLine().toLowerCase().charAt(0)) {
					case 's':
						break confirm;
					case 'n':
						boLoop=false;
						break confirm;
					}
				}
				
				break;
			case 's':
				reset=false;
			}
		}
	}
}
