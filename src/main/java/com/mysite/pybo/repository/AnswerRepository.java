package com.mysite.pybo.repository;

import com.mysite.pybo.domain.QA.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Long>  {

}
