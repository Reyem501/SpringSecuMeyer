/*
package fr.limayrac.spwebflow.controllers;

import fr.limayrac.spwebflow.models.Utilisateur;
import fr.limayrac.spwebflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/lister")
    public ModelAndView listeUsers(){
        return new ModelAndView("listeUsers", "users", userService.getUsers());
    }

    @GetMapping("user/lister/{id}")
    public ModelAndView detailUser(@PathVariable("id") final Integer id){
        Optional<Utilisateur> user = userService.getUser(Long.valueOf(id));
        return new ModelAndView("detailUser","user", user.orElse(null));
    }

    @GetMapping("/user/creer")
    public ModelAndView creerUser(){
        Utilisateur u=new Utilisateur();
        return new ModelAndView("creerUser", "user", u);
    }

    @PostMapping("user/creer")
    public ModelAndView submit(@ModelAttribute("user") Utilisateur user, ModelMap model){
        model.addAttribute("nom", user.getNom());
        model.addAttribute("prenom", user.getPrenom());
        userService.saveUser(user);

        return listeUsers();
    }
}*/
