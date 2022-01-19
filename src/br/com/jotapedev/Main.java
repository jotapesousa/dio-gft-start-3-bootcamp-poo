package br.com.jotapedev;

import br.com.jotapedev.domain.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course c1 = new Course("Advanced Java", "Advanced Java course to add knowledge by experients developers", 120);
        Mentorship m1 = new Mentorship("Java Mentorship", "Description test", LocalDate.now());

//        System.out.println(c1);
//        System.out.println(m1);

        Content content1 = new Course("Design Patterns With Java", "Design Patterns course using Java language", 80);
        Content content2 = new Mentorship("Design Patterns Mentorship", "Design Patterns Mentorship With Java", LocalDate.now());

//        System.out.println(content1);
//        System.out.println(content2);

        Bootcamp boot1 = new Bootcamp("GFT Start #3", "Java course");
        boot1.getContents().add(c1);
        boot1.getContents().add(content1);
        boot1.getContents().add(m1);
        boot1.getContents().add(content2);

        Dev newDev = new Dev("João Paulo", "Sousa");
        Dev newDev2 = new Dev("Amanda", "Freire");

        System.out.println(newDev.getName() + " Cursos inscritos: " + newDev.getRegisteredContents());
        System.out.println(newDev2.getName() + " Cursos inscritos: " + newDev2.getRegisteredContents());
        System.out.println(newDev.getName() + " Cursos inscritos: " + newDev.getCompletedContents());
        System.out.println(newDev2.getName() + " Cursos inscritos: " + newDev2.getCompletedContents());

        newDev.registerBootcamp(boot1);
        newDev2.registerBootcamp(boot1);

        System.out.println(newDev.getName() + " Cursos inscritos: " + newDev.getRegisteredContents());
        System.out.println(newDev2.getName() + " Cursos inscritos: " + newDev2.getRegisteredContents());
        System.out.println(newDev.getName() + " Cursos Concluídos: " + newDev.getCompletedContents());
        System.out.println(newDev2.getName() + " Cursos Concluídos: " + newDev2.getCompletedContents());

        newDev.advance();
        newDev.advance();

        System.out.println(newDev.getName() + " Cursos inscritos: " + newDev.getRegisteredContents());
        System.out.println(newDev2.getName() + " Cursos inscritos: " + newDev2.getRegisteredContents());
        System.out.println(newDev.getName() + " Cursos Concluídos: " + newDev.getCompletedContents());
        System.out.println(newDev2.getName() + " Cursos Concluídos: " + newDev2.getCompletedContents());
        System.out.println(newDev2.getName() + " Cursos Concluídos: " + newDev2.getCompletedContents());
        System.out.println(newDev2.getName() + " Cursos Concluídos: " + newDev2.getCompletedContents());

        System.out.println("Pontuação " + newDev.getName() + ": "+ newDev.calculateXp());
        System.out.println("Pontuação " + newDev2.getName() + ": "+ newDev2.calculateXp());

    }
}
