package br.com.jotapedev.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private String lastName;
    private Set<Content> registeredContents;
    private Set<Content> completedContents;

    public Dev(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.completedContents = new LinkedHashSet<>();
        this.registeredContents = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public void setRegisteredContents(Set<Content> registeredContents) {
        this.registeredContents = registeredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void registerBootcamp(Bootcamp bootcamp){
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.getDevelopers().add(this);
    }

//    public void advance(Content content){
//        if (this.registeredContents.contains(content))
//            this.completedContents.add(content);
//    }

    public void advance(){
        Optional<Content> first = this.registeredContents.stream().findFirst();

        if(first.isPresent()) {
            this.completedContents.add(first.get());
            this.registeredContents.remove(first.get());
        } else {
            System.err.println("Sem conteudo");
        }
    }

    public Double calculateXp(){
        return this.registeredContents.stream().mapToDouble(Content::calculateXP).sum();
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
