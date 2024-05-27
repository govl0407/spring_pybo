package com.mysite.pybo.service;

import com.mysite.pybo.domain.QA.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.mysite.pybo.repository.AnswerRepository;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;


    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}