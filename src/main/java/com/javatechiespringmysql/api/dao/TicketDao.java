package com.javatechiespringmysql.api.dao;

import com.javatechiespringmysql.api.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
