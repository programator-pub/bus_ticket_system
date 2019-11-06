public class UUUGenerator {
    private static long clientId;
    private static long ticketId;

    public static long getNextId(){
        return ++clientId;
    }

    public static long getNextTicketId(){
        return ++ticketId;
    }
}
