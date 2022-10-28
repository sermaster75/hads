package gov.ar.IPSS.Hads.daos;

import gov.ar.IPSS.Hads.entities.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface AfiliadoDao extends JpaRepository<Afiliado,Integer> {

    Afiliado findByDocumento(Integer documento);
   // List<Afiliado> findByIdTitular(Integer idTitular);

//  @Query(value = "select * from afiliado as a where a.AfiTitId =:idTitular and a.AfiMotBaja=0\n" +
//            "\tand (ISNULL(a.AfiFecBaja,'1753-01-01 00:00:00.000')='1753-01-01 00:00:00.000' OR a.AfiFecBaja>getdate()) ",
//            nativeQuery = true)

    List<Afiliado> findBeneficiariosByIdTitular(@Param("afiId") Integer afiId);



    @Query(value = "SELECT COUNT (a.AfiId) FROM AFIPLN AS a\n" +
            "WHERE a.AfiId =:afiId", nativeQuery = true)
    Integer planesActivosCantidad(@Param("afiId") Integer afiId);
}
