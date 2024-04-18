package com.dennis.quizapp1.service;

import com.dennis.quizapp1.dao.QuestionRepository;
import com.dennis.quizapp1.model.Question;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> returnAllQuestions() {
        return questionRepository.findAll();
    }

    @Transactional
    public String addQuestion(Question question) {
        // Save the question using the repository
        Question savedQuestion = questionRepository.save(question);
        // Return some indication of success, perhaps the ID of the saved question
        return "Question added with ID: " + savedQuestion.getId();
    }

    @Transactional
    public void deleteQuestionById(Integer id) {
        questionRepository.deleteById(id);
    }

    public List<Question> getQuestionByCategory(String category) {

      return  questionRepository.findByCategory(category);

    }

    public void deleteQuestionByID(Integer id) {
        questionRepository.deleteById(id);
    }
}

