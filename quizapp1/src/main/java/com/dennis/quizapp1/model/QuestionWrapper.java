package com.dennis.quizapp1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionWrapper {

    private Integer id;
    private String questiontitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper() {
    }

    public QuestionWrapper(Integer id, String questiontitle,
                           String option1, String option2,
                           String option3, String option4) {
        this.id = id;
        this.questiontitle = questiontitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
    // Getters
    @JsonProperty
    public Integer getId() {
        return id;
    }
    @JsonProperty
    public String getQuestiontitle() {
        return questiontitle;
    }
    @JsonProperty
    public String getOption1() {
        return option1;
    }
    @JsonProperty
    public String getOption2() {
        return option2;
    }
    @JsonProperty
    public String getOption3() {
        return option3;
    }
    @JsonProperty
    public String getOption4() {
        return option4;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
}


