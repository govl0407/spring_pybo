package com.mysite.pybo.controller;

import com.mysite.pybo.domain.QA.Question;
import com.mysite.pybo.service.QuestionService;
import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/question")
@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/list")
    public String questions(Model model){
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

}
