package finance.finance.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import finance.finance.Model.produit;

@Repository
public interface produitrepository extends CrudRepository<produit, Integer> {

}
