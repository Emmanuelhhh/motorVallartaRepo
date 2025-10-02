package com.tde.motorVallarta.persistence.destination.repo;


import com.tde.motorVallarta.persistence.destination.entity.TblDescargasLocalizacionPasajeBoletera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargasLocalizacionPasajeBoleteraRepository extends JpaRepository<TblDescargasLocalizacionPasajeBoletera, Long> {
}
