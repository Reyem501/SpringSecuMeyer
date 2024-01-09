package fr.limayrac.spwebflow.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "DECLARATION")
public class Declaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDeclaration;

    @Column(name = "COORDONNEES_BANCAIRE", nullable = false)
    private String coordonneesBancaire;

    @Column(name = "DATE_FORAMTION", nullable = false)
    private Date dateFormation;

    @Column(name = "LIEU_FORAMTION", nullable = false)
    private String lieuFormation;

    @Column(name = "INTITULE_FORMATION", nullable = false)
    private String intituleFormation;

    @ManyToOne
    @JoinColumn(name = "ID_RESTAURATION", nullable = false)
    private FraisRestauration fraisRestauration;

    @ManyToOne
    @JoinColumn(name = "ID_HEBERGEMENT", nullable = false)
    private FraisHebergement fraisHebergement;

    @ManyToOne
    @JoinColumn(name = "ID_FRAIS", nullable = false)
    private FraisTransport fraisTransport;

    @ManyToOne
    @JoinColumn(name = "ID_UTIL", nullable = false)
    private Utilisateur utilisateur;

    // getters and setters
}
