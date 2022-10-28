package gov.ar.IPSS.Hads.mappers;

import gov.ar.IPSS.Hads.dtos.AfiliadoDto;
import gov.ar.IPSS.Hads.entities.Afiliado;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface AfiliadoMapper {
    Afiliado toAfiliadoEntity(AfiliadoDto afiliadoDto);
    AfiliadoDto toAfiliadoDto(Afiliado afiliado);

    default List<AfiliadoDto> toDTOList(List<Afiliado> afiliadoList){
        if (afiliadoList == null){
            return new ArrayList<>();
        }
        return afiliadoList.stream().map(this::toAfiliadoDto).collect(Collectors.toList());
    }
}
