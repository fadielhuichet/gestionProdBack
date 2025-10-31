package com.fedicode.gestionprodback;

import com.fedicode.gestionprodback.entitie.Produit;
import com.fedicode.gestionprodback.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class GestionProdBackApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestionProdBackApplication.class, args);


    }

    @Bean
    CommandLineRunner start(ProduitRepository pr){
        return args -> {
            pr.save(new Produit(null,"pc",1.10,3));
            pr.save(Produit
                    .builder()
                            .id(null)
                            .nom("tablette")
                            .prix(1.5)
                            .quantite(5)
                    .build());
        };
    }

}
