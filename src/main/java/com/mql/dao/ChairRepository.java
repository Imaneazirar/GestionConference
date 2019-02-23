package com.mql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mql.entities.Chair;
@Repository
public interface ChairRepository extends JpaRepository<Chair,Long> {

}
