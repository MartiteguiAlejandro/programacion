package pruebaseclipse;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String frase,caract,caract2;
		int longitud;
		boolean comp=true;
		System.out.println("Introduzca una palabra: ");
		frase=teclado.nextLine();
		longitud=frase.length();
		int j=longitud-1;
		for(int i=0;i<longitud;i++) {
			if(i<=j) {
				caract=frase.substring(i,i+1);
				caract2=frase.substring(j,j+1);
				if(!caract.equals(caract2)) {
					comp=false;
				}
				j--;
			}
		}
		if(comp) {
			System.out.println("Es palindromo");
		}else 
			System.out.println("NO es palindromo");
	}	
}

