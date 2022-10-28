package gov.ar.IPSS.Hads.api_rest_controllers;

import gov.ar.IPSS.Hads.business_controllers.PrestadorController;
import gov.ar.IPSS.Hads.dtos.AfiliadoDto;
import gov.ar.IPSS.Hads.dtos.PrestadorDto;
import gov.ar.IPSS.Hads.entities.Prestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PrestadorResource.PRESTADORES)
public class PrestadorResource {
    public  static final String PRESTADORES = "/prestadores";

    @Autowired
    PrestadorController prestadorController;

    @GetMapping(path = "/{cuit}")
    public PrestadorDto prestadorPorCuit(@PathVariable("cuit") String cuit){
        return prestadorController.porCuit(cuit);
    }

}
