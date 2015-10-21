package com.spdukraine.mvc.service.impl;


import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.AnswerDao;
import com.spdukraine.mvc.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {


    @Autowired
    private AnswerDao answerDao;

    @Override
    @Transactional
    public void insert(Answer answer) {
        answerDao.insert(answer);
    }

    @Override
    @Transactional
    public void delete(int id) {
        answerDao.delete(id);
    }

    @Override
    @Transactional
    public Answer findAnswerById(int id) {
        return this.answerDao.findAnswerById(id);
    }

    @Override
    @Transactional
    public void updateAnswer(Answer answer) {
        answerDao.updateAnswer(answer);
    }

    @Override
    @Transactional
    public List<Answer> getAllAnswer() {
        return this.answerDao.getAllAnswer();
    }

    @Override
    @Transactional
    public Answer findAnswerByQuestionId(int questionId) {
        return this.answerDao.findAnswerByQuestionId(questionId);
    }
}
