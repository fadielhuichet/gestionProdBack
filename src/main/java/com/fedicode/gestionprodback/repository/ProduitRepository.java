package com.fedicode.gestionprodback.repository;

import com.fedicode.gestionprodback.entitie.Produit;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProduitRepository extends JpaRepository<Produit,Long> {


}
