package com.mysite.sbb.reply.dao;

import com.mysite.sbb.article.domain.Article;
import com.mysite.sbb.reply.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
