package pl.connectis.programator.dao;

import pl.connectis.programator.model.Client;
import pl.connectis.programator.model.Route;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.model.Worker;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static List<Client> clientList = new ArrayList<>();
    private static List<Worker> workerList = new ArrayList<>();
    private static List<Ticket> ticketList = new ArrayList<>();
    private static List<Route> routeList = new ArrayList<>();

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
}
