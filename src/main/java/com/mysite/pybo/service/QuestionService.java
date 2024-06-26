package com.mysite.pybo.service;

import java.util.List;

import com.mysite.pybo.domain.QA.Question;
import com.mysite.pybo.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.mysite.pybo.service.DataNotFoundException;
import java.time.LocalDateTime;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(Long.valueOf(id));
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }

    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }

}