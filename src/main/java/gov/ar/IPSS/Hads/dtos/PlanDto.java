package gov.ar.IPSS.Hads.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlanDto {
    Integer Id;
    String descripcion;
    LocalDateTime fechaDesde;
    LocalDateTime fechaHasta;
}
