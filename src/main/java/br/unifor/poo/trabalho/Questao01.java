package br.unifor.poo.trabalho;

import java.util.Scanner;

public class Questao01 {
	
	Scanner scan = new Scanner(System.in);
	
	public void triangulo(double L1, double L2,double L3){

	
        System.out.println("Digite as posições x1 e y1 ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		System.out.println("Digite as posições x2 e y2 ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		System.out.println("Digite as posições x3 e y3 ");
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();

        L1 = Math.sqrt(Math.pow((x1-x3),2)*Math.pow((y1-y3),2));
        L2 = Math.sqrt(Math.pow((x2-x1),2)*Math.pow((y1-y2),2));
        L3 = Math.sqrt(Math.pow((x2-x3),2)*Math.pow((y2-y3),2));
        
		if((L1<(L2+L3))&&(L2<(L1+L3))&&(L3<(L1+L2))){
			System.out.println("forma um triangulo. \n");
			double P = L1+L2+L3;
			System.out.println("forma um triangulo: ");
			System.out.println(P);
			}else{
				System.out.println("não forma um triangulo");				
			}
		}
	}