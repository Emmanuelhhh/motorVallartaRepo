package com.tde.motorVallarta.persistence.destination.repo;

import com.tde.motorVallarta.persistence.destination.entity.TblDescargasEfectivoBoletera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargasEfectivoBoleteraRepository extends JpaRepository<TblDescargasEfectivoBoletera, Long> {
}
