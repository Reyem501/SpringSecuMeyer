package fr.limayrac.spwebflow.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "FRAIS_RESTAURATION")
public class FraisRestauration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestauration;

    @Column(name = "DATE_RESTAURATION", nullable = false)
    private Date dateRestauration;

    @Column(name = "MONTANT_RESTAURATION", nullable = false)
    private String montantRestauration;

    // getters and setters
}
