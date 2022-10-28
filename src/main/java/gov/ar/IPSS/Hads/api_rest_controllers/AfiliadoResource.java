package gov.ar.IPSS.Hads.api_rest_controllers;

import gov.ar.IPSS.Hads.business_controllers.AfiliadoController;
import gov.ar.IPSS.Hads.dtos.AfiliadoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AfiliadoResource.AFILIADOS)
public class AfiliadoResource {
    public static final String AFILIADOS = "/afiliados";

    @Autowired
    AfiliadoController afiliadoController;

    @GetMapping(path = "/{documento}")
    public AfiliadoDto afiliadoPorDocumento(@PathVariable("documento") Integer documento){
        return afiliadoController.afiliadoPorDocumento(documento);
    }

 /*   @GetMapping
    public AfiliadoDto afiPorDocumento(@RequestParam (value = "documento") Integer documento){
        return afiliadoController.afiliadoPorDocumento(documento);
    }*/

    @GetMapping
    public List<AfiliadoDto> beneficiariosPorTitular(@RequestParam (value ="idTitular") Integer idTitular){
        return  afiliadoController.beneficiariosPorId(idTitular);
    }
}
