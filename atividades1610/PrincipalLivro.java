package atividades1610;

public class PrincipalLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro("MD", "Sesi");
		
		System.out.println("Nome do Livro: " + livro.getTitulo() + " Autor: " + livro.getAutor());
	}

}
