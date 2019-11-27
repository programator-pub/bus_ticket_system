package pl.connectis.programator.dao;

import pl.connectis.programator.model.*;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DB {

    private static List<Client> clientList = new ArrayList<>();
    private static List<Worker> workerList = new ArrayList<>();
    private static List<Ticket> ticketList = new ArrayList<>();
    private static List<Route> routeList = new ArrayList<>();

    public DB() {
        routeList.add(new Route(new BigDecimal(100), "Warszawa", "Krakow", Duration.ofHours(2)));
        routeList.add(new Route(new BigDecimal(130), "Warszawa", "Trojmiasto", Duration.ofMinutes(4)));
        routeList.add(new Route(new BigDecimal(150), "Warszawa", "Wroclaw", Duration.ofMinutes(300)));
        ticketList.add(new Ticket(TicketType.STUDENT, ValidUntil._24H, routeList.get(0)));
        ticketList.add(new Ticket(TicketType.STUDENT, ValidUntil._24H, routeList.get(1)));
        ticketList.add(new Ticket(TicketType.STUDENT, ValidUntil._24H, routeList.get(2)));
        clientList.add(new Client("Andrzej", "Kowalski"));
        clientList.add(new Client("Jan", "Nowak"));
        clientList.add(new Client("Marian", "Domagala"));
        clientList.get(0).addNewTicket(ticketList.get(0));
        clientList.get(1).addNewTicket(ticketList.get(1));
        clientList.get(2).addNewTicket(ticketList.get(2));
    }

    public static List<Client> getClientList() {
        return clientList;
    }

    public static Client addClientToList(Client newClient) {
        clientList.add(newClient);
        return newClient;
    }

    public static void deleteClientFromList(Client client) {
        clientList.remove(client);
    }

    public static List<Worker> getWorkerList() {
        return workerList;
    }

    public static Worker setWorkerList(Worker newWorker) {
        workerList.add(newWorker);
        return newWorker;
    }

    public static List<Ticket> getTicketList() {
        return ticketList;
    }

    public static Ticket setTicketList(Ticket newTicket) {
        ticketList.add(newTicket);
        return newTicket;
    }

    public static List<Route> getRouteList() {
        return routeList;
    }

    public static Route addRouteToList(Route newRoute) {
        routeList.add(newRoute);
        return newRoute;
    }

    public static Ticket addTicketToList(Ticket newTicket) {
        ticketList.add(newTicket);
        return newTicket;
    }
}
