package com.dennis.quizapp1.controller;

import com.dennis.quizapp1.model.Question;
import com.dennis.quizapp1.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/AllQuestions")
    public List<Question> returnAllQuestions() {

        return questionService.returnAllQuestions();
    }
    @GetMapping("/AllQuestions/{question-category}")
    public List<Question> getQuestionByCategory( @PathVariable("question-category") String  category) {

        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("/Post-Question")
    @ResponseStatus(HttpStatus.CREATED)
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }
    @DeleteMapping("/AllQuestions/{question-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete( @PathVariable("question-id") Integer id ) {
        questionService.deleteQuestionByID(id);
    }

}
