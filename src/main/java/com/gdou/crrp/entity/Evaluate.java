package com.gdou.crrp.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_evaluate")
public class Evaluate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int uid;

    private int rid;

    private int level;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
                ", level=" + level +
                ", content='" + content + '\'' +
                '}';
    }
}
