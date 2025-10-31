package com.fedicode.gestionprodback.service;

import com.fedicode.gestionprodback.entitie.Produit;

import java.util.List;

public interface Iproduit {
    public List<Produit> getAllProduit();
    public void supprimerProd(Long id);
    public void ajouterProd(Produit p);
}
