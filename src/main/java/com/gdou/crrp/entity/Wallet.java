package com.gdou.crrp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_wallet")
public class Wallet {
    @Id
    private int uid;

    @Column(name = "money",columnDefinition = "int default 0")
    private int money;

    @Column(name = "bill", columnDefinition = "text")
    private  String bill;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "uid=" + uid +
                ", money=" + money +
                ", bill='" + bill + '\'' +
                '}';
    }
}
