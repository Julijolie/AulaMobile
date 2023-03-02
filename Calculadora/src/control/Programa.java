package control;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	Calculadora calculadora= new Calculadora();
	
	System.out.printf ("Digite o o primeiro valor:");
	double valorA = sc.nextDouble();
	
	System.out.printf("Digite o segundo valor:");
	double valorB = sc.nextDouble();
	
	System.out.printf("Informe a operação desejada: ");
	System.out.println("1 - soma; 2 - Subtração; 3 - multiplicação; 4 - divisão");
	int operacao= sc.nextInt();
	
	
	switch(operacao) {
	case 1:{
		System.out.println(calculadora.somar(valorA, valorB));
		break;
	}
	case 2:{
		System.out.println(calculadora.subtrair(valorA, valorB));
		break;
	}
	case 3:{
		System.out.println(calculadora.multiplicar(valorA, valorB));
		break;
	}
	case 4:{
		System.out.println(calculadora.dividir(valorA, valorB));
		break;
	}
	}
	}
	
}