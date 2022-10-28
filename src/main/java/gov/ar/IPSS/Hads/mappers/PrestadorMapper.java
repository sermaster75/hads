package gov.ar.IPSS.Hads.mappers;

import gov.ar.IPSS.Hads.dtos.PrestadorDto;
import gov.ar.IPSS.Hads.entities.Prestador;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PrestadorMapper {
    Prestador toPrestadorEntity(PrestadorDto prestadorDto);
    PrestadorDto toPrestadorDTO(Prestador prestador);


    default List<PrestadorDto> doDtolist(List<Prestador> prestadorList){
        if(prestadorList == null){
            return  new ArrayList<>();
        }
        return prestadorList.stream().map(this::toPrestadorDTO).collect(Collectors.toList());
    }

}
