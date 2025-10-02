package com.tde.motorVallarta.persistence.origin.repo;

import com.tde.motorVallarta.persistence.origin.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargaViaxerBoleteraExpRepository extends JpaRepository<TblDescargaViaxerBoleteraExp, Integer> {

	@Query(value = "SELECT TOP (1) * " +
            "FROM [Vallarta].[dbo].[tblDescarga_Viaxer_BOLETERA_Exp] " +
            "WHERE  1 = 1" +
            "ORDER BY id", 
            nativeQuery = true)
			Iterable<TblDescargaViaxerBoleteraExp> findTopByVarControl();

}
