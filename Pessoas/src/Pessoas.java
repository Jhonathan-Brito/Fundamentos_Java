
public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Fisica fis = new Fisica();
			
			
			fis.nome = "JÕAO";
			fis.cpf = "107.818.080-65";
			fis.identidade = "156045";
			fis.situacaoPessoa = "A";
			
			Juridica jur = new Juridica();
			
			jur.nome = "CASA DOS SILVA";
			jur.cnpj = "90.106.715/0001-16";			
			jur.inscEstadual = "45454545";
			jur.situacaoPessoa = "I";
			
			System.out.println("Dados da Pessoa Física");
			System.out.println(fis.toString());
			System.out.println("Dados da Pessoa Juridica");
			System.out.println(jur.toString());
			
	}

}
