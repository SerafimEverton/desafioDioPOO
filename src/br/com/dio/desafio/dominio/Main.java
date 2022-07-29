package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		Mentoria mentoria2 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o do curso Java");
		curso1.setCargaHoraria(500);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o do curso JS");
		curso2.setCargaHoraria(570);
		
		/*Conteudo conteudo = new Curso();*/
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descri��o da mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Mentoria JS");
		mentoria2.setDescricao("Descri��o da Mentoria JS");
		mentoria2.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);
		System.out.println(mentoria2);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Boocamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�do de Inscritos de Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("---");
		devCamila.getConteudosConcluidos();
		System.out.println("Conte�do de Inscritos de Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conte�do Conclu�do de Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXP());

		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		Dev devJoao = new Dev();
		devCamila.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�do de Inscritos de Jo�o: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("---");
		devJoao.getConteudosConcluidos();
		System.out.println("Conte�do de Inscritos de Jo�o: " + devJoao.getConteudosInscritos());
		System.out.println("Conte�do de Inscritos de Jo�o: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXP());
		
		System.out.println("----------");
		System.out.println("Total de Devs inscritos �: " + bootcamp.getDevsInscritos());
	}

}
