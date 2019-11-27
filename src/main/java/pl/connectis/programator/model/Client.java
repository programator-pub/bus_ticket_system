package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private long id;
    private String firstName;
    private String secondName;
    private List<Ticket> tickets;

    public Client() {
        this.id = UUUGenerator.getNextClientId();
    }

    public Client(String firstName, String secondName) {
        this.id = UUUGenerator.getNextClientId();
        this.firstName = firstName;
        this.secondName = secondName;
        this.tickets = new ArrayList<>();
    }

    public Client(String firstName, String secondName, Ticket ticket) {
        this.id = UUUGenerator.getNextClientId();
        this.firstName = firstName;
        this.secondName = secondName;
        this.tickets.add(ticket);
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
        this.tickets.addAll(tickets);
    }

    public void setTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void addNewTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
