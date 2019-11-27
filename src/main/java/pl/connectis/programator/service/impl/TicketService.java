package pl.connectis.programator.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.connectis.programator.dao.DB;
import pl.connectis.programator.model.Ticket;
import pl.connectis.programator.model.api.NbpRate;

import java.math.BigDecimal;

public class TicketService {

    public BigDecimal getForeignPrices(Ticket ticket, String currency) {
        String homeResource = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/today/";

        RestTemplate request = new RestTemplate();
        ResponseEntity<NbpRate> response = request.getForEntity(homeResource, NbpRate.class);
        NbpRate nbpRate = response.getBody();
        return ticket.getPrice().multiply(new BigDecimal(nbpRate.getRates()[0].getMid()));
    }

    public Ticket addTicket(Ticket ticket) {
        return DB.addTicketToList(ticket);
    }
}
