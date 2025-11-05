package com.tde.motorVallarta.persistence.origin.repo;

import com.tde.motorVallarta.persistence.origin.entity.TblDescargasAvl;
import com.tde.motorVallarta.persistence.origin.entity.TblDescargasAvl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblDescargasAvlRepositoryO extends JpaRepository<TblDescargasAvl, Long> {
	@Query(value = "SELECT TOP (1000) * " +
            "FROM [Vallarta].[dbo].[tblDescargasAVL] " +
            "WHERE  intVarControl = :varControl " +
            "ORDER BY id", 
            nativeQuery = true)
			Iterable<TblDescargasAvl> findTopByVarControl(@Param("varControl") Integer varControl);


}