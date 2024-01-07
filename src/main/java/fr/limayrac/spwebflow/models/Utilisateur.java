package fr.limayrac.spwebflow.models;

import javax.persistence.*;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtil;

    @Column(name = "NOM", nullable = false)
    private String nom;

    @Column(name = "PRENOM", nullable = false)
    private String prenom;

    @Column(name = "MDP", nullable = false)
    private String mdp;

    @ManyToOne
    @JoinColumn(name = "ID_ROLE", nullable = false)
    private Role role;

    // getters and setters
}
