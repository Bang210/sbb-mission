package com.ll.sbbmission.domain.answer;

import com.ll.sbbmission.domain.question.Question;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Answer {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(columnDefinition = "Text")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
}
