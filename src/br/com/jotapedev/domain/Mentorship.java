package br.com.jotapedev.domain;

import java.time.LocalDate;

public class Mentorship extends Content{
    private LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public Double calculateXP() {
        return XP_PADRAO + 20;
    }
}
