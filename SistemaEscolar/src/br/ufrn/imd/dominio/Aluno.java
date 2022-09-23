package br.ufrn.imd.dominio;

public class Aluno {
	private String nome;
	private Prova prova1;
	private Prova prova2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Prova getProva1() {
		return prova1;
	}
	public void setProva1(Prova prova1) {
		this.prova1 = prova1;
	}
	public Prova getProva2() {
		return prova2;
	}
	public void setProva2(Prova prova2) {
		this.prova2 = prova2;
	}
	public double calcularMedia() {
		return (prova1.calculaNotaTotal() + prova2.calculaNotaTotal())/2;
	}
	
}
