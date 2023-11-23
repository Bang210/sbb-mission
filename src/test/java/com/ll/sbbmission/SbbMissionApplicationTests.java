package com.ll.sbbmission;

import com.ll.sbbmission.domain.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbMissionApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트데이터:[%03d]", i);
            String content = "No Content";
            questionService.create(subject, content);
        }
    }
}
