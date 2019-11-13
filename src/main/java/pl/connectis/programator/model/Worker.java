package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;

public class Worker {

    private long id;
    private String firstName;
    private String secondName;

    public Worker(String firstName, String secondName) {
        this.id = UUUGenerator.getNextWorkerId();
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
