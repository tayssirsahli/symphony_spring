package com.tayssir.cosmetique.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tayssir.cosmetique.entities.Classification;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {

}
