package finance.finance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finance.finance.Model.produit;
import finance.finance.Repository.produitrepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class produitservice {

    @Autowired
    produitrepository produitrepo;

    public List<produit> getallproduit() {
        return (List<produit>) produitrepo.findAll();
    }

    public produit getSingleproduit(int id) {
        return produitrepo.findById(id).get();
    }

    public void deleteproduit(int id) {
        produitrepo.deleteById(id);
    }

    public produit addNewProduit(produit produit) {
        return produitrepo.save(produit);
    }

    public produit updateProduit(produit produit) {
        return produitrepo.save(produit);
    }
}
