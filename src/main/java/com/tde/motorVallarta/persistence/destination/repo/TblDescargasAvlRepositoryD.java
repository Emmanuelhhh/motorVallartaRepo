package com.tde.motorVallarta.persistence.destination.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tde.motorVallarta.persistence.destination.entity.TblDescargasAvlD;

@Repository
public interface TblDescargasAvlRepositoryD extends JpaRepository<TblDescargasAvlD, Long> {
}
