package com.gdou.crrp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_doctor")
public class Doctor {

    @Id
    private int rid;

    private int did;

    private String name;

    @Column(name = "workyear")
    private int workyear;

    private String phone;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkyear() {
        return workyear;
    }

    public void setWorkyear(int workyear) {
        this.workyear = workyear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "rid=" + rid +
                ", did=" + did +
                ", name='" + name + '\'' +
                ", workyear=" + workyear +
                ", phone='" + phone + '\'' +
                '}';
    }
}
