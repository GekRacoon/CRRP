package com.gdou.crrp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tb_friend_info")
public class FriendInfo {

    @Id
    private int uid;

    private int friend_id;

    private Date add_time;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int friend_id) {
        this.friend_id = friend_id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    @Override
    public String toString() {
        return "FriendInfo{" +
                "uid=" + uid +
                ", friend_id=" + friend_id +
                ", add_time=" + add_time +
                '}';
    }
}
