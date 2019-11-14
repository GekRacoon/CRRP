package com.gdou.crrp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tb_diagnose")
public class Diagnose {

    @Id
    private  int reservation_id;

    private String doctor_name;

    @Column(name = "illmsg",columnDefinition = "text not null")
    private String illmsg;

    @Column(name = "drag", columnDefinition = "text not null")
    private String drag;

    private Date time;

    private int istake;

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getIllmsg() {
        return illmsg;
    }

    public void setIllmsg(String illmsg) {
        this.illmsg = illmsg;
    }

    public String getDrag() {
        return drag;
    }

    public void setDrag(String drag) {
        this.drag = drag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getIstake() {
        return istake;
    }

    public void setIstake(int istake) {
        this.istake = istake;
    }

    @Override
    public String toString() {
        return "Diagnose{" +
                "reservation_id=" + reservation_id +
                ", doctor_name='" + doctor_name + '\'' +
                ", illmsg='" + illmsg + '\'' +
                ", drag='" + drag + '\'' +
                ", time=" + time +
                ", istake=" + istake +
                '}';
    }
}
