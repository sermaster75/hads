package gov.ar.IPSS.Hads.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "PRESTA")
public class Prestador implements Serializable {
    @Id
    @Column(name = "PrsId")
    Integer id;

    @Column(name = "PrsApellid")
    String apellido;

    @Column (name = "PrsCuit")
    String cuit;

    @Column (name = "PrsNombre")
    String nombre;
}
