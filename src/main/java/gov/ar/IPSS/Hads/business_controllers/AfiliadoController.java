package gov.ar.IPSS.Hads.business_controllers;

import gov.ar.IPSS.Hads.daos.AfiliadoDao;
import gov.ar.IPSS.Hads.dtos.AfiliadoDto;
import gov.ar.IPSS.Hads.entities.Afiliado;
import gov.ar.IPSS.Hads.mappers.AfiliadoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.List;

@Controller
public class AfiliadoController {
    @Autowired
    AfiliadoDao afiliadoDao;

    @Autowired
    AfiliadoMapper afiliadoMapper;


    public AfiliadoDto afiliadoPorDocumento(Integer documento){
        Afiliado afiliado = afiliadoDao.findByDocumento(documento);
        AfiliadoDto  afiliadoDto = afiliadoMapper.toAfiliadoDto(afiliado);

     //   if(afiliado.getFechaDeBaja().isAfter(LocalDateTime.now()))
        if(afiliado.getFechaDeBaja() == null || afiliado.getFechaDeBaja().isAfter(LocalDateTime.now()))

        {
            afiliadoDto.setEstado("De alta");
        }
        else {
            afiliadoDto.setEstado("De baja desde el " + afiliado.getFechaDeBaja());


        }
        if (afiliado.getIdTitular().equals(afiliado.getId())){
            afiliadoDto.setAfiliacion("Titular");
            afiliadoDto.setBeneficiarios(afiliadoDao.findBeneficiariosByIdTitular(afiliado.getId()));
        }
        else {
           afiliadoDto.setAfiliacion("Beneficiario");
        }
     // agregamos los planes
        afiliadoDto.setPlanes(afiliadoDao.planesActivosCantidad(afiliado.getId()));

        return afiliadoDto;
    }

   public List<AfiliadoDto> beneficiariosPorId(Integer idTitular){

       List<Afiliado> afiliadoList = afiliadoDao.findBeneficiariosByIdTitular(idTitular);

       return  afiliadoMapper.toDTOList(afiliadoList);

   }


}
