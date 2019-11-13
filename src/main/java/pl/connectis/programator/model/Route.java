package pl.connectis.programator.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Route {

    private BigDecimal price;
    private String start;
    private String destination;
    private LocalDateTime tripDuration;

    public Route(BigDecimal price, String start, String destination, LocalDateTime tripDuration) {
        this.price = price;
        this.start = start;
        this.destination = destination;
        this.tripDuration = tripDuration;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getTripDuration() {
        return tripDuration;
    }

    @Override
    public String toString() {
        return "Route{" +
                "price=" + price +
                ", start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", tripDuration=" + tripDuration +
                '}';
    }
}
