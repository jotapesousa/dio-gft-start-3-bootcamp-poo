package br.com.jotapedev;

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
    }
}
