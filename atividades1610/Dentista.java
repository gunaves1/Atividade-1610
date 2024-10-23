package atividades1610;

public class Dentista extends ProfissionalSaude{
	private String cro;
	
	public Dentista() {
	}
	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	@Override
	public void agendaConsulta() {
		System.out.println("Nome: " + nome + " Especialidade: " + especialidade + " Valor da consulta: R$" + valorConsulta + " CRO: " + cro);
	}
}