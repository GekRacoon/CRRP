package com.gdou.crrp.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_chat_msg")
public class ChatMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int msg_from;

    private int msg_to;

    @Column(name = "chat_data", columnDefinition = "text not null")
    private String chat_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsg_from() {
        return msg_from;
    }

    public void setMsg_from(int msg_from) {
        this.msg_from = msg_from;
    }

    public int getMsg_to() {
        return msg_to;
    }

    public void setMsg_to(int msg_to) {
        this.msg_to = msg_to;
    }

    public String getChat_data() {
        return chat_data;
    }

    public void setChat_data(String chat_data) {
        this.chat_data = chat_data;
    }

    @Override
    public String toString() {
        return "ChatMsg{" +
                "id=" + id +
                ", msg_from='" + msg_from + '\'' +
                ", msg_to='" + msg_to + '\'' +
                ", chat_data='" + chat_data + '\'' +
                '}';
    }
}
