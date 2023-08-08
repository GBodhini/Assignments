package com.bodh.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bodh.rest.entity.Train;

public interface TrainRepository extends JpaRepository<Train,Integer>
{
	
}
