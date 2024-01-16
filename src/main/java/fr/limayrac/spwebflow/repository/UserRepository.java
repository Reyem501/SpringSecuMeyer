package fr.limayrac.spwebflow.repository;

import fr.limayrac.spwebflow.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Utilisateur, Long> {
    @Query("SELECT u FROM Utilisateur u WHERE u.email = ?1")
    public Utilisateur findByEmail(String email);

}
