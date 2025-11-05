package com.tde.motorVallarta.persistence.origin.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tde.motorVallarta.persistence.origin.entity.DescargasOdometroO;

@Repository
public interface DescargasOdometroRepoO extends CrudRepository<DescargasOdometroO, Long> {

	@Query(value = "SELECT TOP (1000) * " + "FROM [Vallarta].[dbo].[tblDescargasOdometro] "
			+ "ORDER BY [id_DGPRS] ", nativeQuery = true)
	Iterable<DescargasOdometroO> findTopByVarControl(@Param("varControl") Integer varControl);
}
