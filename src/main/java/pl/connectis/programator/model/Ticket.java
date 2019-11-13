package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Ticket {
    private long id;
    private TicketType type;
    private BigDecimal price;
    private LocalDate validUntil;
    private Route route;

    public Ticket(TicketType type, LocalDate validUntil, Route route) {
        this.id = UUUGenerator.getNextTicketId();
        this.type = type;
        this.price = route.getPrice().multiply(new BigDecimal(type.getDiscount()));
        this.validUntil = validUntil;
        this.route = route;
    }

    public long getId() {
        return id;
    }

    public TicketType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public Route getRoute() {
        return route;
    }


}
