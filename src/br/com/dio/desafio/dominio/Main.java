package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		Mentoria mentoria2 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(500);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição do curso JS");
		curso2.setCargaHoraria(570);
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição da mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Mentoria JS");
		mentoria2.setDescricao("Descrição da Mentoria JS");
		mentoria2.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);
		System.out.println(mentoria2);
	}

}
