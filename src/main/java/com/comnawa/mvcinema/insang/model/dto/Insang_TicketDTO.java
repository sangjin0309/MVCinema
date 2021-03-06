package com.comnawa.mvcinema.insang.model.dto;

import java.util.Date;

public class Insang_TicketDTO {
  /*---------------------영화정보-------------------------*/
  private int movie_idx; // 영화 정보
  private String title; // 제목
  private int age; // 관람 나이 제한
  private int people; // 관람객
  private Date release_date; // 개봉일
  private int runtime; // 영화시간
  private String img_url;
  /*-------------------영화 상영  정보------------------------------*/
  private int theater_idx; // 상영관 정보
  private Date start_time; // 상영 시간
  private String start_date;
  private String end_date;
  private int empty_sit; // 남은좌석
  /*-------------------상영관  정보------------------------------*/
  private int screen_idx;
  private int t_idx;
  private String t_name;
  private int seat_max;
  private int price;
  private String seat_out; // 이미 예매된 좌석
  /*-------------------티켓정보--------------------------------*/
  private int ticket_idx;
  private String t_userid;
  private int t_age;
  private String t_title;
  private String t_theater;
  private String t_start_time;
  private int t_people;
  private int t_price;
  private String t_seat;
  private String t_serial_num;
  private String email;
  /*----------insang--------*/
  private int m_age;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getMovie_idx() {
    return movie_idx;
  }

  public void setMovie_idx(int movie_idx) {
    this.movie_idx = movie_idx;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getPeople() {
    return people;
  }

  public void setPeople(int people) {
    this.people = people;
  }

  public Date getRelease_date() {
    return release_date;
  }

  public void setRelease_date(Date release_date) {
    this.release_date = release_date;
  }

  public int getRuntime() {
    return runtime;
  }

  public void setRuntime(int runtime) {
    this.runtime = runtime;
  }

  public String getImg_url() {
    return img_url;
  }

  public void setImg_url(String img_url) {
    this.img_url = img_url;
  }

  public int getTheater_idx() {
    return theater_idx;
  }

  public void setTheater_idx(int theater_idx) {
    this.theater_idx = theater_idx;
  }

  public Date getStart_time() {
    return start_time;
  }

  public void setStart_time(Date start_time) {
    this.start_time = start_time;
  }

  public String getStart_date() {
    return start_date;
  }

  public void setStart_date(String start_date) {
    this.start_date = start_date;
  }

  public String getEnd_date() {
    return end_date;
  }

  public void setEnd_date(String end_date) {
    this.end_date = end_date;
  }

  public int getEmpty_sit() {
    return empty_sit;
  }

  public void setEmpty_sit(int empty_sit) {
    this.empty_sit = empty_sit;
  }

  public int getScreen_idx() {
    return screen_idx;
  }

  public void setScreen_idx(int screen_idx) {
    this.screen_idx = screen_idx;
  }

  public int getT_idx() {
    return t_idx;
  }

  public void setT_idx(int t_idx) {
    this.t_idx = t_idx;
  }

  public String getT_name() {
    return t_name;
  }

  public void setT_name(String t_name) {
    this.t_name = t_name;
  }

  public int getSeat_max() {
    return seat_max;
  }

  public void setSeat_max(int seat_max) {
    this.seat_max = seat_max;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getSeat_out() {
    return seat_out;
  }

  public void setSeat_out(String seat_out) {
    this.seat_out = seat_out;
  }

  public int getTicket_idx() {
    return ticket_idx;
  }

  public void setTicket_idx(int ticket_idx) {
    this.ticket_idx = ticket_idx;
  }

  public String getT_userid() {
    return t_userid;
  }

  public void setT_userid(String t_userid) {
    this.t_userid = t_userid;
  }

  public int getT_age() {
    return t_age;
  }

  public void setT_age(int t_age) {
    this.t_age = t_age;
  }

  public String getT_title() {
    return t_title;
  }

  public void setT_title(String t_title) {
    this.t_title = t_title;
  }

  public String getT_theater() {
    return t_theater;
  }

  public void setT_theater(String t_theater) {
    this.t_theater = t_theater;
  }

  public String getT_start_time() {
    return t_start_time;
  }

  public void setT_start_time(String t_start_time) {
    this.t_start_time = t_start_time;
  }

  public int getT_people() {
    return t_people;
  }

  public void setT_people(int t_people) {
    this.t_people = t_people;
  }

  public int getT_price() {
    return t_price;
  }

  public void setT_price(int t_price) {
    this.t_price = t_price;
  }

  public String getT_seat() {
    return t_seat;
  }

  public void setT_seat(String t_seat) {
    this.t_seat = t_seat;
  }

  public String getT_serial_num() {
    return t_serial_num;
  }

  public void setT_serial_num(String t_serial_num) {
    this.t_serial_num = t_serial_num;
  }

  public Insang_TicketDTO() {
    // TODO Auto-generated constructor stub
  }

  public Insang_TicketDTO(int movie_idx, String title, int age, int people, Date release_date, int runtime, String img_url,
      int theater_idx, Date start_time, String start_date, String end_date, int empty_sit, int screen_idx,
      int t_idx, String t_name, int seat_max, int price, String seat_out, int ticket_idx, String t_userid,
      int t_age, String t_title, String t_theater, String t_start_time, int t_people, int t_price, String t_seat,
      String t_serial_num, int m_age) {
    super();
    this.movie_idx = movie_idx;
    this.title = title;
    this.age = age;
    this.people = people;
    this.release_date = release_date;
    this.runtime = runtime;
    this.img_url = img_url;
    this.theater_idx = theater_idx;
    this.start_time = start_time;
    this.start_date = start_date;
    this.end_date = end_date;
    this.empty_sit = empty_sit;
    this.screen_idx = screen_idx;
    this.t_idx = t_idx;
    this.t_name = t_name;
    this.seat_max = seat_max;
    this.price = price;
    this.seat_out = seat_out;
    this.ticket_idx = ticket_idx;
    this.t_userid = t_userid;
    this.t_age = t_age;
    this.t_title = t_title;
    this.t_theater = t_theater;
    this.t_start_time = t_start_time;
    this.t_people = t_people;
    this.t_price = t_price;
    this.t_seat = t_seat;
    this.t_serial_num = t_serial_num;
    this.m_age= m_age;
  }

  @Override
  public String toString() {
    return "TicketDTO [movie_idx=" + movie_idx + ", title=" + title + ", age=" + age + ", people=" + people
        + ", release_date=" + release_date + ", runtime=" + runtime + ", img_url=" + img_url + ", theater_idx="
        + theater_idx + ", start_time=" + start_time + ", start_date=" + start_date + ", end_date=" + end_date
        + ", empty_sit=" + empty_sit + ", screen_idx=" + screen_idx + ", t_idx=" + t_idx + ", t_name=" + t_name
        + ", seat_max=" + seat_max + ", price=" + price + ", seat_out=" + seat_out + ", ticket_idx="
        + ticket_idx + ", t_userid=" + t_userid + ", t_age=" + t_age + ", t_title=" + t_title + ", t_theater="
        + t_theater + ", t_start_time=" + t_start_time + ", t_people=" + t_people + ", t_price=" + t_price
        + ", seat=" + t_seat + ", t_serial_num=" + t_serial_num + ", m_age=" + m_age + "]";
  }

  public void setM_age(int m_age) {
    this.m_age = m_age;
  }
  
  public int getM_age() {
    return m_age;
  }
  
}