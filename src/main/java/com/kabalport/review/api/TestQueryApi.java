package com.kabalport.review.api;

import com.kabalport.review.model.TestEntity;
import com.kabalport.review.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;

    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa() {
        return testService.findAllByNameByJPA("kabalport");
    }

    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl() {
        return testService.findAllByNameByQuerydsl("kabalport");
    }
}
