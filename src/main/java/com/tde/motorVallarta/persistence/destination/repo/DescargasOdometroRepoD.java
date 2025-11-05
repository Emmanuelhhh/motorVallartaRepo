package com.tde.motorVallarta.persistence.destination.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tde.motorVallarta.persistence.destination.entity.DescargasOdometroD;


@Repository
public interface DescargasOdometroRepoD extends CrudRepository<DescargasOdometroD, Long>{

}
