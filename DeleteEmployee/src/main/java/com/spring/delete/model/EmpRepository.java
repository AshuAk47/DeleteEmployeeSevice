package com.spring.delete.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmpRepository extends  JpaRepository<Emp, Integer> {

}