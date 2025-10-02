package com.tde.motorVallarta.persistence.origin.repo;

import com.tde.motorVallarta.persistence.origin.entity.TblDescargasAvl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargasAvlRepositoryO extends JpaRepository<TblDescargasAvl, Long> {
}