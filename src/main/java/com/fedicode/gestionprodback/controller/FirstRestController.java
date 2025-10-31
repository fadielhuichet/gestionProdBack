package com.fedicode.gestionprodback.controller;

import com.fedicode.gestionprodback.entitie.Produit;
import com.fedicode.gestionprodback.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstRestController {
    @Autowired
    ProduitRepository pr;
    @GetMapping("/all")
    public List<Produit> getAllProduit(){
        return pr.findAll();
    }

}
