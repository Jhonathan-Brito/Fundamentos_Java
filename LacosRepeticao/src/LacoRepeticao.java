
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - la�o pr�-testado
		
		int qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		}
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");
	
		// Do While - la�o p�s-testado
		qtdVezes =1;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		} while (qtdVezes <= 10);
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");
	}
}
	
	
