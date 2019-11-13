package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;
import java.util.List;

public class Client {
    private long id;
    private String firstName;
    private String secondName;
    private List<Ticket> tickets;

    public Client(String firstName, String secondName) {
        this.id = UUUGenerator.getNextId();
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
