package com.mysite.pybo.service;

import java.util.List;

import com.mysite.pybo.domain.QA.Question;
import com.mysite.pybo.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}