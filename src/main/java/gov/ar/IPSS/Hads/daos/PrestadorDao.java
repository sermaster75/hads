package gov.ar.IPSS.Hads.daos;

import gov.ar.IPSS.Hads.entities.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorDao extends JpaRepository<Prestador,Integer> {
    Prestador findByCuit(String cuit);
}
