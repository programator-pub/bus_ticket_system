package pl.connectis.programator.model;

import pl.connectis.programator.util.UUUGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Ticket {
    private long id;
    private TicketType type;
    private BigDecimal price;
    private LocalDateTime validUntil;
    private Route route;

    public Ticket(TicketType type, ValidUntil validUntil, Route route) {
        this.id = UUUGenerator.getNextTicketId();
        this.type = type;
        this.price = route.getPrice().multiply(new BigDecimal(type.getDiscount()));
        this.validUntil = validUntil.getValidUntil();
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

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    public Route getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", type=" + type +
                ", price=" + price +
                ", validUntil=" + validUntil +
                ", route=" + route +
                '}';
    }
}
