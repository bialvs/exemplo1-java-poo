package dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descição");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso javaScript");
		curso2.setDescricao("descição");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria Java");
		mentoria1.setDescricao("descicao");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescriccao("Descrição do bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devFulano = new Dev();
		devFulano.setNome("Fulano");
		devFulano.inscreverBootcamp(bootcamp);
		System.out.println("COnteúdos incritos Fulano: " + devFulano.getConteudosInscritos());
		devFulano.progredir();
		System.out.println("COnteúdos incritos Fulano: " + devFulano.getConteudosInscritos());
		System.out.println("COnteúdos concluídos Fulano: " + devFulano.getConteudosConcluidos());
		System.out.println("XP: " + devFulano.calcularTotalXp());
		
		Dev devSicrano = new Dev();
		devSicrano.setNome("Sicrano");
		devSicrano.inscreverBootcamp(bootcamp);
		System.out.println("COnteúdos incritos Sicrano: " + devSicrano.getConteudosInscritos());
		devSicrano.progredir();
		devSicrano.progredir();
		devSicrano.progredir();
		System.out.println("COnteúdos incritos Sicrano: " + devSicrano.getConteudosInscritos());
		System.out.println("COnteúdos concluídos Sicrano: " + devSicrano.getConteudosConcluidos());
		System.out.println("XP: " + devSicrano.calcularTotalXp());
		
	
		
		
	}

}
