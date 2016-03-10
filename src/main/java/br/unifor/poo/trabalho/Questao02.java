package br.unifor.poo.trabalho;

import java.util.Scanner;

public class Questao02 {
	static Scanner scan = new Scanner(System.in);
	
	public int fibonacci(int n){
		if ((n == 1) || (n == 2))
	         return(1);
	      else return(fibonacci(n-1) + fibonacci(n-2));
	    }
	
	public static void main(String[] args) {
		Questao02 q2 = new Questao02();
		System.out.printf("Informe a posicao do termo na sequencia de Fibonacci desejada:\n");
	    int n = scan.nextInt();
		q2.fibonacci(n);
		
		
	}
}