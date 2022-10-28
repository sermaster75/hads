package gov.ar.IPSS.Hads.dtos;

import gov.ar.IPSS.Hads.entities.Afiliado;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class AfiliadoDto {
   Integer id;
   String nombre;
   String apellido;
   Integer documento;
    String afiliacion;
    String estado;
    LocalDateTime fechaDeBaja;

    String email;
    Integer cuil;

   List<Afiliado> beneficiarios;
    Integer planes;
}
