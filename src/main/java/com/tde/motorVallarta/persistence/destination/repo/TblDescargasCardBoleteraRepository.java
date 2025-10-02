package com.tde.motorVallarta.persistence.destination.repo;

import com.tde.motorVallarta.persistence.destination.entity.TblDescargasCardBoletera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargasCardBoleteraRepository extends JpaRepository<TblDescargasCardBoletera, Long> {
}
