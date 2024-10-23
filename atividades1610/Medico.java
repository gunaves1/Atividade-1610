package atividades1610;

public class Medico extends ProfissionalSaude{
	private String crm;
	
	public Medico() {
	}
	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	@Override
	public void agendaConsulta() {
		System.out.println("Nome: " + nome + " Especialidade: " + especialidade + " Valor da consulta: R$" + valorConsulta + " CRM: " + crm);
	}
}