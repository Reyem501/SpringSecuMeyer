package fr.limayrac.spwebflow.models;


import jakarta.persistence.*;


@Entity
@Table(name = "FRAIS_HEBERGEMENT")
public class FraisHebergement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHebergement;

    @Column(name = "HEBERGEMENT_GRATUIT", nullable = false)
    private boolean hebergementGratuit;

    @Column(name = "HEBERGEMENT_PAYANT", nullable = false)
    private boolean hebergementPayant;

    @Column(name = "MONTANT_HEBERGEMENT", nullable = false)
    private String montantHebergement;

    // getters and setters
}
