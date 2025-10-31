package com.fedicode.gestionprodback.controller;

import com.fedicode.gestionprodback.entitie.Produit;
import com.fedicode.gestionprodback.repository.ProduitRepository;
import com.fedicode.gestionprodback.service.Iproduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstRestController {
//    @Autowired
//    ProduitRepository pr;
    @Autowired
    Iproduit p;
    @GetMapping("/all")
    public List<Produit> getAllProduit(){
        //return pr.findAll();
        return p.getAllProduit();
    }
    @GetMapping("/delete/{id}")
    public void supprimerProd(@PathVariable Long id){
        //pr.deleteById(id);
        p.supprimerProd(id);
    }
    @PostMapping("/add")
    public void ajouterProd(@RequestBody Produit p1){
        //pr.save(p1);
        p.ajouterProd(p1);

    }

}
