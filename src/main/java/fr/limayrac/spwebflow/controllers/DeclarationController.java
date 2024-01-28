/*
package fr.limayrac.spwebflow.controllers;

import fr.limayrac.spwebflow.models.Declaration;
import fr.limayrac.spwebflow.service.DeclarationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class DeclarationController {

    @Autowired
    private DeclarationService declarationService;

    @GetMapping("/declaration/lister")
    public ModelAndView listeDeclaration(){
        return new ModelAndView("listeUsers", "users", declarationService.getDeclarations());
    }

*/
/*    @GetMapping("declaration/lister/{id}")
    public ModelAndView detailDeclaration(@PathVariable("id") final Integer id){
        Optional<Declaration> declaration = declarationService.getDeclaration(Long.valueOf(id));
        return new ModelAndView("detailDeclaration","declaration", declaration.orElse(null));
    }*//*


    @GetMapping("/declaration/creer")
    public ModelAndView creerDeclaration(){
        Declaration u=new Declaration();
        return new ModelAndView("creerDeclaration", "declaration", u);
    }

*/
/*    @PostMapping("declaration/creer")
    public ModelAndView submit(@ModelAttribute("declaration") Declaration declaration, ModelMap model){
        model.addAttribute("coordonneesBancaire", declaration.getCoordonneesBancaire());
        model.addAttribute("dateFormation", declaration.getDateFormation());
        model.addAttribute("lieuFormation", declaration.getLieuFormation());
        model.addAttribute("intituleFormation", declaration.getIntituleFormation());
        declarationService.saveDeclaration(declaration);

        return listeDeclarations();
    }*//*

}*/
