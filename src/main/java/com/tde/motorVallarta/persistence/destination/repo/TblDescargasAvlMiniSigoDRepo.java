package com.tde.motorVallarta.persistence.destination.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tde.motorVallarta.persistence.destination.entity.*;

@Repository
public interface TblDescargasAvlMiniSigoDRepo extends CrudRepository<DescargasMiniSigoD, Long >{

}
