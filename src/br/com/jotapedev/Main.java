package br.com.jotapedev;

import br.com.jotapedev.domain.Content;
import br.com.jotapedev.domain.Course;
import br.com.jotapedev.domain.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course c1 = new Course("Advanced Java", "Advanced Java course to add knowledge by experients developers", 120);
        Mentorship m1 = new Mentorship("Java Mentorship", "Description test", LocalDate.now());

        System.out.println(c1);
        System.out.println(m1);

        Content content1 = new Course("Design Patterns With Java", "Design Patterns course using Java language", 80);
        Content content2 = new Mentorship("Design Patterns Mentorship", "Design Patterns Mentorship With Java", LocalDate.now());

        System.out.println(content1);
        System.out.println(content2);
    }
}
