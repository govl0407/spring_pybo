package com.mysite.pybo.domain.QA;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.List;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter @Setter


@Table(name="questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private  String content;

    @CreationTimestamp
    @Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
