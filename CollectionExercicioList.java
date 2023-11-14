package collectionsJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class CollectionExercicioList {

	public static void main(String[] args) {
		String cor;
	
		Scanner receba = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList();
		
		for(int x=0;x<6;x++) {
			System.out.println("Digite uma cor:  ");
			cor = receba.nextLine();
			cores.add(cor);
		}
		System.out.println("Sua lista de cores é: "+cores);
		Collections.sort(cores);
		System.out.println("Sua lista de cores em ordem crescente é: "+cores);
	}

}
