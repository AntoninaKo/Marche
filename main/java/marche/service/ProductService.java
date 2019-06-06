package marche.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import marche.domain.Age;
import marche.domain.Product;
import marche.domain.Variaty;


public interface ProductService {

void save(Product product);
    
    void delete(Product product);

    //Product findOne(long productId) throws ProductNotFoundException;

    List<Product> findAllOrderById();
    
    Page<Product> findAll(PageRequest request);
    
    List<Product> findByAge(Age age);
    
    Page<Product> findByDistillery(Age age, Pageable pageable);
    
    Page<Product> findByType(Variaty variaty, Pageable pageable);
	
}
