import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// Entrada de Dados vi JOPtionPane
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade da pessoa"));
//		System.out.println("A pessoa tem " + idade + "anos de idade");
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade");
		JOptionPane.showMessageDialog(null, "Teste", "ATENÇÃO!!!", 1);

	}

}
