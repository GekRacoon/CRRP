package com.gdou.crrp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tb_topic_collect")
public class TopicCollect {

    @Id
    private int uid;

    private int topic_id;

    private Date time;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TopicCollect{" +
                "uid=" + uid +
                ", topic_id=" + topic_id +
                ", time=" + time +
                '}';
    }
}
