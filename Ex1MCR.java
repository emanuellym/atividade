package metodos;

import java.util.Scanner;

public class Ex1MCR {

	public static String Estacao (int escolhido) {
		
		if(escolhido==1) {
			return "é calor";
		}
		else if(escolhido==2) {
			return "as folhas caem";
		}
		else if(escolhido==3) {
			return "é frio";
			}
		else  {
			return "as folhas voltam";
		}
		
		

	}
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escolha entre: 1-verao 2-outono "
				           + "3-inverno 4-primavera:");
		int escolha = sc.nextInt();
		
		System.out.println(Estacao(escolha));
		
	
	}


}
