package br.com.jotapedev.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate inicialDate = LocalDate.now();
    private final LocalDate finalDate = inicialDate.plusDays(45);
    private Set<Dev> developers;
    private Set<Content> contents;

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
        this.developers = new HashSet<>();
        this.contents = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInicialDate() {
        return inicialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Dev> developers) {
        this.developers = developers;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(inicialDate, bootcamp.inicialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(developers, bootcamp.developers) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, inicialDate, finalDate, developers, contents);
    }
}
