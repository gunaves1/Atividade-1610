package atividades1610;

public class Fisioterapeuta extends ProfissionalSaude{
	private String crefito;
	
	public Fisioterapeuta() {
	}
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	public String getCrefito() {
		return crefito;
	}
	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}
	@Override
	public void agendaConsulta() {
		System.out.println("Nome: " + nome + " Especialidade: " + especialidade + " Valor da consulta: R$" + valorConsulta + " Crefito: " + crefito);
	}
}