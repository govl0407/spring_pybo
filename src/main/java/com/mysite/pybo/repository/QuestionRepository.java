package com.mysite.pybo.repository;

import com.mysite.pybo.domain.QA.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
