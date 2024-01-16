package fr.limayrac.spwebflow.models;


import jakarta.persistence.*;


@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtil;

    @Column(name = "EMAIL", nullable = false)
    private String email;

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

    public String getMdp() {
        return mdp;
    }

    public String getEmail() {return email;}

    public String getNom() {return nom;}

    public String getPrenom() {return prenom;}
}
