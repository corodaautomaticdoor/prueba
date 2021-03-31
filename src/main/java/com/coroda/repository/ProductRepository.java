package com.coroda.repository;

import com.coroda.entity.OriginProduct;
import com.coroda.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("from Product p where p.origin = :originProduct")
    List<Product> searchOrigin (@Param("originProduct") OriginProduct originProduct);

    @Query("from Product p where p.model =:modelProduct")
    List<Product> searchModelProduct (@Param("modelProduct")String modelProduct);

    @Query("from Product p where p.origin= :originProduct and p.model = :modelProduct")
    List<Product> getData (@Param("originProduct") OriginProduct originProduct, @Param("modelProduct")String modelProduct);

//    @Query("from Product p where p.category = :categoryProduct")
//    List<Product> searchCategory (@Param("categoryProduct") String categoryProduct);
}
