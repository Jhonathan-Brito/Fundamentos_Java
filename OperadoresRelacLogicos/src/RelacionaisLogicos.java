
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > <= >= != ==
		
		int num1, num2;
		
		// testando uma igualdade
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2 ) {
			System.out.println("Numero 1 e num2 são iguais");
		}
				
		//testando uma desigualdade
		num1 = 10;
		num2 = 30;
		if (num1 != num2) {
			System.out.println("Numero 1 e num2 são diferentes");
		}
		
		//testatndo maior
		num1 = 10;
		num2 = 30;
		if (num1 > num2) {
			System.out.println("Número 1 é maior que o número 2");
		} else {
			System.out.println("Número 2 é maior que número 1");
		}
		
		//operadores lógicos
		// && = e / AND || = ou / OR
		num1 = 20;
		num2 = 5;
		int num3 = 10, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
			
		}
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		} else {
			System.out.println("Segunda opção satisfeita");
			
		}
	}

}
