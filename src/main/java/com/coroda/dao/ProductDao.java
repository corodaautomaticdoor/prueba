package com.coroda.dao;

import com.coroda.dto.request.ProductRequest;
import com.coroda.dto.response.ProductResponse;
import com.coroda.entity.OriginProduct;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface ProductDao {

    Completable save(ProductRequest model);
    Completable delete(Long id);
    Completable update(ProductRequest model);
    Single<ProductResponse> getById(Long id);
    Observable<ProductResponse> findAll();

    Observable<ProductResponse> searchOrigin(OriginProduct originProduct);
    Observable<ProductResponse> searchModelProduct(String modelProduct);
    Observable<ProductResponse> searchCategoryProduct(String categoryProduct);
    Observable<ProductResponse> getData(OriginProduct originProduct, String modelProduct);

}
