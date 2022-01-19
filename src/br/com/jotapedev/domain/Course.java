package br.com.jotapedev.domain;

public class Course extends Content{
    private int workload;

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public Double calculateXP() {
        return XP_PADRAO * 20;
    }
}
