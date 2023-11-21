package com.ll.sbbmission.domain.question;

import com.ll.sbbmission.domain.answer.Answer;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Question {
    @Id     //primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY)      //auto-increment
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "Text")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}