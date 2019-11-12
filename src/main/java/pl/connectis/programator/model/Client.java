package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;

import java.math.BigDecimal;

public class Client {
    private long id;
    private String firstName;
    private String secondName;
    private Ticket tickets;
    private BigDecimal balance;

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

    public Ticket getTickets() {
        return tickets;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setTickets(Ticket tickets) {
        this.tickets = tickets;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) return false;
        if (secondName != null ? !secondName.equals(client.secondName) : client.secondName != null) return false;
        if (tickets != null ? !tickets.equals(client.tickets) : client.tickets != null) return false;
        return balance != null ? balance.equals(client.balance) : client.balance == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (tickets != null ? tickets.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        return result;
    }
}
