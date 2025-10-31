package com.fedicode.gestionprodback.service;

import com.fedicode.gestionprodback.entitie.Produit;
import com.fedicode.gestionprodback.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService implements Iproduit {
    @Autowired
    ProduitRepository pr;
    @Override
    public List<Produit> getAllProduit() {
        return  pr.findAll();
    }

    @Override
    public void supprimerProd(Long id) {
        pr.deleteById(id);

    }

    @Override
    public void ajouterProd(Produit p) {
        pr.save(p);

    }
}
