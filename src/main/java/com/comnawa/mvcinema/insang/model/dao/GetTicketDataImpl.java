package com.comnawa.mvcinema.insang.model.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.comnawa.mvcinema.sungwon.model.ticket.dto.TicketDTO;

@Repository
public class GetTicketDataImpl implements GetTicketData{
  
  @Inject
  SqlSession sqlSession;
  
  @Override
  public List<TicketDTO> getGuestData() {
    Date date= new Date(System.currentTimeMillis());
    return null;
  }
  
  @Override
  public List<TicketDTO> getMemberData() {
    return sqlSession.selectList("insang_chart.ticketMember");
  }
  
  private int getLastDay(String year, String month, String date){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date)); 
    int chkdd = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    return chkdd;
  }
  
}