package gov.ar.IPSS.Hads.business_controllers;

import gov.ar.IPSS.Hads.daos.PrestadorDao;
import gov.ar.IPSS.Hads.dtos.PrestadorDto;
import gov.ar.IPSS.Hads.entities.Prestador;
import gov.ar.IPSS.Hads.mappers.PrestadorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrestadorController {
    @Autowired
    PrestadorDao prestadorDao;
    @Autowired
    PrestadorMapper prestadorMapper;

    public PrestadorDto porCuit(String cuit){
        return  prestadorMapper.toPrestadorDTO(prestadorDao.findByCuit(cuit));
    }
}
