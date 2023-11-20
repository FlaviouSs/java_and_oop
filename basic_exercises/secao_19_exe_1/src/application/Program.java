package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		for(int k = sc.nextInt(); k > 0; k--) {
			a.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		for(int k = sc.nextInt(); k > 0; k--) {
			b.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		for(int k = sc.nextInt(); k > 0; k--) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> conjunto_de_alunos = new HashSet<>();
		conjunto_de_alunos.addAll(a); conjunto_de_alunos.addAll(b); conjunto_de_alunos.addAll(c);
		
		System.out.println("Total students: " + conjunto_de_alunos.size());
		
		sc.close();
	}

}
