package gov.ar.IPSS.Hads.daos;

import gov.ar.IPSS.Hads.entities.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanDao extends JpaRepository<Plan,Integer> {

   // Plan findById(Integer id);

}
//
//    @Query(value = "SELECT p.PlnId, p.PlnDes FROM AFIPLN AS a\n" +
//            "INNER JOIN PLANES AS p ON p.PlnId = a.PlnId\n" +
//            "WHERE a.AfiId =:afiId", nativeQuery = true)
//   List<Plan>  planesActivosCantidad(@Param("afiId") Integer afiId);

