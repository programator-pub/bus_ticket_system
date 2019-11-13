package pl.connectis.programator.util;

public class UUUGenerator {
    private static long clientId;
    private static long ticketId;
    private static long workerId;


    public static long getNextClientId(){
        return ++clientId;
    }

    public static long getNextTicketId(){
        return ++ticketId;
    }

    public static long getNextWorkerId() {
        return ++workerId;
    }
}
