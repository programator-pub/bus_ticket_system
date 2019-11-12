package pl.connectis.programator.model;

public enum TicketType {

    STUDENT("Studencki",50.00),
    SENIOR("Senior",65.00),
    PUPIL("Szkolny",55.00),
    NORMAL("Normlany",0.00);

    private String type;
    private double discount;

    TicketType(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }
}
