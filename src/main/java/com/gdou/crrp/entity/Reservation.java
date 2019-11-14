package com.gdou.crrp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String user_name;

    private String doctor_name;

    private Date time;

    private String room;

    private String user_phone;

    private String doctor_phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getDoctor_phone() {
        return doctor_phone;
    }

    public void setDoctor_phone(String doctor_phone) {
        this.doctor_phone = doctor_phone;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", doctor_name='" + doctor_name + '\'' +
                ", time=" + time +
                ", room='" + room + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", doctor_phone='" + doctor_phone + '\'' +
                '}';
    }
}
