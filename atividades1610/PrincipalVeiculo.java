package atividades1610;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Moto moto = new Moto("Batmóvel", "Batmoto", 1989, "Preto", 700);
		Automovel automovel = new Automovel("Paganni", "Sena", 2035, "Laranja", 2, "W16 Twincharger");
		
		moto.exibirInfo();
		automovel.exibirInfo();
	}
}
