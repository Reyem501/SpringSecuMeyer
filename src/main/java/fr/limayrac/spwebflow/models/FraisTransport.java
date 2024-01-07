package fr.limayrac.spwebflow.models;

import javax.persistence.*;

@Entity
@Table(name = "FRAIS_TRANSPORT")
public class FraisTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFrais;

    @Column(name = "LIBELLE_FRAIS", nullable = false)
    private String libelleFrais;

    @Column(name = "MON_VEHICULE", nullable = false)
    private boolean monVehicule;

    @Column(name = "LIEU_DEPART", nullable = false)
    private String lieuDepart;

    @Column(name = "MONTANT_TRANSPORT", nullable = false)
    private String montantTransport;

    // getters and setters
}
