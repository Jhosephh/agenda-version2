package jgpe.agenda.version2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;
    private String nombre;

    @Column(name = "fechanac")
    private LocalDate fechaNacimiento;
    private String celular;
    private String email;
    @Column(name = "fechareg")
    private LocalDate fechaRegistro;
}
