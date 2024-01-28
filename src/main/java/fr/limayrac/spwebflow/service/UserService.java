/*
package fr.limayrac.spwebflow.service;

import fr.limayrac.spwebflow.models.Utilisateur;
import fr.limayrac.spwebflow.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<Utilisateur> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public List<Utilisateur> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final Integer idUtil) {
        userRepository.deleteById(Long.valueOf(idUtil));
    }

    public Utilisateur saveUser(Utilisateur utilisateur) {
        return userRepository.save(utilisateur);
    }
}
*/
