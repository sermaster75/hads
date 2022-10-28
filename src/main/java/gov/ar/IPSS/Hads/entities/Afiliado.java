package gov.ar.IPSS.Hads.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "AFILIADO")
public class Afiliado {
    @Id
    @Column(name = "AfiId")
    Integer id;

    @Column(name = "AfiTitId")
    Integer idTitular;

    @Column(name = "AfiDocNro")
    Integer documento;

    @Column(name = "AfiNom")
    String nombre;

    @Column(name = "AfiApe")
    String apellido;

     @Column(name = "AfiFecBaja",columnDefinition = "smalldatetime")
    LocalDateTime fechaDeBaja;

    @Column(name = "AfiEMail")
    String email;

    @Column(name = "AfiCuil")
    Integer cuil;
}
