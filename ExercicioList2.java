package collectionsJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExercicioList2 {

	public static void main(String[] args) {
		int n;
		Scanner receba = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(9);
		numeros.add(3);
		numeros.add(12);
		numeros.add(20);
		numeros.add(76);
		numeros.add(21);
		numeros.add(16);
		numeros.add(29);
		numeros.add(5);
		numeros.add(2);
		
		System.out.println("Informe o número que você deseja encontrar:  ");
		n = receba.nextInt();
		if(numeros.contains(n)) {
			System.out.println("O número "+n+" está na posição "+numeros.indexOf(n));
		}else {
			System.out.println("o número "+n+" não foi encontrado!");
		}
		
	}

}
