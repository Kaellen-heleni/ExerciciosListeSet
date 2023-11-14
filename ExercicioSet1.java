package collectionsJava;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;


public class ExercicioSet1 {

	public static void main(String[] args) {
		int n;
		Scanner receba = new Scanner(System.in);
		
Set<Integer> listaSet = new HashSet<Integer>();

	for(int x=0;x<10;x++) {
		System.out.println("Digite um número:  ");
		n = receba.nextInt();
		
		   if(listaSet.contains(n)) {
			  System.out.println("Esse número já foi informado! Digite um número diferente: ");
			   n = receba.nextInt();
			   listaSet.add(n);
		}else { 
			listaSet.add(n);
		}
	}

	System.out.println(listaSet);
	
	Iterator<Integer> iListaSet = listaSet.iterator();
	
	while(iListaSet.hasNext()) {
		System.out.println(iListaSet.next());
	}
	 		}
	}

