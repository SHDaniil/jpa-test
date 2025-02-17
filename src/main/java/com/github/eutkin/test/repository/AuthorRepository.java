package com.github.eutkin.test.repository;

import com.github.eutkin.test.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Nullable
    Author findByName(String name);
}
