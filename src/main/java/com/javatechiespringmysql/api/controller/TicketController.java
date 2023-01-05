package com.javatechiespringmysql.api.controller;

import com.javatechiespringmysql.api.dao.TicketDao;
import com.javatechiespringmysql.api.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets){
        dao.saveAll(tickets);
        //for (Ticket ticket:tickets) {dao.save(ticket);}
        return "Tickets booked " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return (List<Ticket>) dao.findAll();
    }
}





