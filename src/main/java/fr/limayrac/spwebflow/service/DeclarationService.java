/*
package fr.limayrac.spwebflow.service;

import fr.limayrac.spwebflow.models.Declaration;
import fr.limayrac.spwebflow.models.Utilisateur;
import fr.limayrac.spwebflow.repository.DeclarationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeclarationService {
    @Autowired
    private DeclarationRepository declarationRepository;

    public Optional<Utilisateur> getDeclaration(Long idDeclaration) {
        return declarationRepository.findById(idDeclaration);
    }

    public List<Utilisateur> getDeclarations() {
        return declarationRepository.findAll();
    }

    public void deleteUser(final Integer idDeclaration) {
        declarationRepository.deleteById(Long.valueOf(idDeclaration));
    }

*/
/*    public Declaration saveDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }*//*

}
*/
