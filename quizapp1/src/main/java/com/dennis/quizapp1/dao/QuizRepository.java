package com.dennis.quizapp1.dao;

import com.dennis.quizapp1.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {


}
