import java.math.BigDecimal;
import java.time.LocalDate;


public class Ticket {
    long id;
    TicketType type;
    BigDecimal price;
    LocalDate validUntil;
    Route route;

    public Ticket(TicketType type, LocalDate validUntil, Route route) {
        this.id = UUUGenerator.getNextTicketId();
        this.type = type;
//        this.price = price;
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
