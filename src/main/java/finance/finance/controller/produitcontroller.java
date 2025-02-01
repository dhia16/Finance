package finance.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finance.finance.Model.produit;
import finance.finance.Service.produitservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/produits")
public class produitcontroller {
    @Autowired
    produitservice produitservice;

    @GetMapping("/produits")
    public List<produit> getAllProduit() {
        return produitservice.getallproduit();
    }

    @GetMapping("/singleproduit/{id}")
    public produit getSingleproduit(@PathVariable int id) {
        return produitservice.getSingleproduit(id);
    }

    @PostMapping("/ajoutproduit")
    public produit AjoutProduit(@RequestBody produit produit) {
        return produitservice.addNewProduit(produit);

    }

    @PutMapping("/updateproduit")
    public produit updateProduit(@RequestBody produit produit) {
        return produitservice.updateProduit(produit);
    }

}
