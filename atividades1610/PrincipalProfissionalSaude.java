package atividades1610;

public class PrincipalProfissionalSaude {

	public static void main(String[] args) {
		Medico medico = new Medico("Sergio", "Dermatologia", 150, "56473625-009");
		Dentista dentista = new Dentista("Marcos", "Cirurgia", 400, "23454678-007");
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Clotilde", "Cardiovascular", 250, "294765-098");
		
		medico.agendaConsulta();
		dentista.agendaConsulta();
		fisioterapeuta.agendaConsulta();
	}

}
