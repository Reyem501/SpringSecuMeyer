package fr.limayrac.spwebflow.models;

import javax.persistence.*;


@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @Column(name = "LIBELLE_ROLE", nullable = false)
    private String libelleRole;

    // getters and setters
}
