package finance.finance.Model;

import java.lang.annotation.Inherited;

@Entity
public class produit {

@Id 
@GeneratedValue(strategy = GenrationType.IDENETITY)

int id ;

private String nomProduit;

}
