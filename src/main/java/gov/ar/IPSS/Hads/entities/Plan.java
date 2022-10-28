package gov.ar.IPSS.Hads.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "PLANES")
public class Plan {
    @Id
    @Column(name = "PlnId")
    Integer id;

    @Column(name = "PlnDes")
    String descripcion;


}
