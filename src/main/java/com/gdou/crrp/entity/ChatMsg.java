package com.gdou.crrp.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_chat_msg")
public class ChatMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "msg_from", nullable = false)
    private String msg_from;

    @Column(name = "msg_to", nullable = false)
    private String msg_to;

    @Column(name = "chat_data", columnDefinition = "text not null")
    private String chat_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg_from() {
        return msg_from;
    }

    public void setMsg_from(String msg_from) {
        this.msg_from = msg_from;
    }

    public String getMsg_to() {
        return msg_to;
    }

    public void setMsg_to(String msg_to) {
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
