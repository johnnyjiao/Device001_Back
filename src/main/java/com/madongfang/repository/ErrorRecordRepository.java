package com.madongfang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madongfang.entity.ErrorRecord;

public interface ErrorRecordRepository extends JpaRepository<ErrorRecord, Integer> {

}
