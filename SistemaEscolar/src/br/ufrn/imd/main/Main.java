package br.ufrn.imd.main;

import java.text.DecimalFormat;

import br.ufrn.imd.dominio.Aluno;
import br.ufrn.imd.dominio.Prova;
import br.ufrn.imd.dominio.Turma;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		Prova prova1 = new Prova();
		Prova prova2 = new Prova();
		
		prova1.setNotaParte1(6.5);
		prova1.setNotaParte2(6.5);
		prova2.setNotaParte1(8);
		prova2.setNotaParte2(8);
		
		Prova prova3 = new Prova();
		Prova prova4 = new Prova();
		
		prova3.setNotaParte1(9.5);
		prova3.setNotaParte2(9.5);
		prova4.setNotaParte1(3);
		prova4.setNotaParte2(3);
		
		Prova prova5 = new Prova();
		Prova prova6 = new Prova();
		
		prova5.setNotaParte1(7.5);
		prova5.setNotaParte2(7.5);
		prova6.setNotaParte1(9);
		prova6.setNotaParte2(9);
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Julio");
		aluno1.setProva1(prova1);
		aluno1.setProva2(prova2);
		
		aluno2.setNome("Ivison");
		aluno2.setProva1(prova3);
		aluno2.setProva2(prova4);
		
		aluno3.setNome("Itamir");
		aluno3.setProva1(prova5);
		aluno3.setProva2(prova6);
		
		Turma turma = new Turma();
		turma.setAluno1(aluno1);
		turma.setAluno2(aluno2);
		turma.setAluno3(aluno3);
		
		System.out.println("Média dos alunos:");
		System.out.println(aluno1.getNome()+": "+ formatar.format(aluno1.calcularMedia()));
		System.out.println(aluno2.getNome()+": "+ formatar.format(aluno2.calcularMedia()));
		System.out.println(aluno3.getNome()+": "+ formatar.format(aluno3.calcularMedia()));
		
		System.out.println("Média da Turma:" + formatar.format(turma.calcularMedia()));

	}

}
