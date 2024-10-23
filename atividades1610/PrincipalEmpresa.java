package atividades1610;

public class PrincipalEmpresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Financeiro");
		Empresa empresa = new Empresa("Spacegomes", departamento);
		
		System.out.println("Nome da Empresa: " + empresa.getNome() + " Departamento: " + departamento.getNome());

	}

}
