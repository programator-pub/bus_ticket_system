package pl.connectis.programator.model;

import java.math.BigDecimal;
import java.time.Duration;

public class Route {

    private BigDecimal price;
    private String start;
    private String destination;
    private Duration tripDuration;

    public Route() {
    }

    public Route(BigDecimal price, String start, String destination, Duration tripDuration) {
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

    public Duration getTripDuration() {
        return tripDuration;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTripDuration(Duration tripDuration) {
        this.tripDuration = tripDuration;
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
