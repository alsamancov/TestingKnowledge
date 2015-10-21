package com.spdukraine.mvc.repository;


import com.spdukraine.mvc.entity.Question;

import java.util.List;

public interface QuestionDao {
    public void insert(Question question);
    public void delete(int id);
    public Question findQuestionById(int id);
    public void updateQuestion(Question question);
    public List<Question> getAllQuestion();
}
