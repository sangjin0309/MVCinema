package com.comnawa.mvcinema.sungwon.service.ticket;

import java.util.Date;
import java.util.List;

import com.comnawa.mvcinema.sungwon.model.ticket.dto.TicketDTO;

public interface TicketService {
	public List<TicketDTO> movieList();
	public List<TicketDTO> screen_time(String start_date , String endDate,int movie_idx);
}
