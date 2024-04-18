package com.dennis.quizapp1.dao;


import com.dennis.quizapp1.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> deleteAllById(Integer id);

    List<Question> findByCategory(String category);
    List<Integer> findQuestionIdsByCategory(String category);

    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);


}

