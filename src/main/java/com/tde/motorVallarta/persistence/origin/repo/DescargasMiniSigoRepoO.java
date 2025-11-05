package com.tde.motorVallarta.persistence.origin.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tde.motorVallarta.persistence.origin.entity.DescargasMiniSigoO;




//@Repository se deshabilita ya que aun no se tiene tabla origen 
public interface DescargasMiniSigoRepoO extends CrudRepository<DescargasMiniSigoO, Long> {

	
	
	@Query(value = "SELECT TOP (2000) * " +
            "FROM [Vallarta].[dbo].[tblDescarga_MiniSigo] " +
            "WHERE  1 = 1 " +// se quito el filtro ya que varControl en este caso siempre sera el mismo. 
            "ORDER BY id_DGPRS", 
            nativeQuery = true)
			Iterable<DescargasMiniSigoO> findTopByVarControl(@Param("varControl") Integer varControl);
}
