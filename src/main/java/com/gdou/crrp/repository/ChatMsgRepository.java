package com.gdou.crrp.repository;

import com.gdou.crrp.entity.ChatMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMsgRepository extends JpaRepository<ChatMsg, Integer> {
}
