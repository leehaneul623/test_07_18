package com.mysite.sbb.reply.controller;

import com.mysite.sbb.article.dao.ArticleRepository;
import com.mysite.sbb.article.domain.Article;
import com.mysite.sbb.reply.dao.ReplyRepository;
import com.mysite.sbb.reply.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/usr/reply")
public class ReplyController {
    @Autowired
    private ReplyRepository replyRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<Reply> replies() {
        return replyRepository.findAll();
    }
}
