package com.ll.sbbmission.answer;

import com.ll.sbbmission.question.Question;
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
