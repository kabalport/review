package com.kabalport.review.repository;

import com.kabalport.review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {

    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
