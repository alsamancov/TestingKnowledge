package com.spdukraine.mvc.controller;

import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.entity.Question;
import com.spdukraine.mvc.service.AnswerService;
import com.spdukraine.mvc.service.ApplicantService;
import com.spdukraine.mvc.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class TestController {

    private QuestionService questionService;
    private AnswerService answerService;
    private ApplicantService applicantService;

    @Autowired
    public TestController(QuestionService questionService, AnswerService answerService, ApplicantService applicantService){
        this.questionService = questionService;
        this.answerService = answerService;
        this.applicantService = applicantService;
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String getQuestions(Model model){
        List<Question> questions = this.questionService.getAllQuestion();
        model.addAttribute("questions", questions);
        return "test";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String addApplicant(Model model){
        model.addAttribute("applicant", new Applicant());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addApplicant(@ModelAttribute("applicant") Applicant applicant){
        this.applicantService.insert(applicant);
        return "redirect:/test";
    }
}
