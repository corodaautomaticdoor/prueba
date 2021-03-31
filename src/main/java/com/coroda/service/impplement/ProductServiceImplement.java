package com.coroda.service.impplement;

import com.coroda.dao.ProductDao;
import com.coroda.dto.request.ProductRequest;
import com.coroda.dto.response.ProductResponse;
import com.coroda.entity.OriginProduct;
import com.coroda.service.ProductService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ProductServiceImplement implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Completable save(ProductRequest model) {
        return productDao.save(model);
    }

    @Override
    public Completable delete(Long id) {
        return productDao.delete(id);
    }

    @Override
    public Completable update(ProductRequest model) {
        return productDao.update(model);
    }

    @Override
    public Single<ProductResponse> getById(Long id) {
        return productDao.getById(id);
    }

    @Override
    public Observable<ProductResponse> getByModel(String model) {
        return productDao.searchModelProduct(model);
    }

    @Override
    public Observable<ProductResponse> getData(Map<String, String> params) {
        log.info("Busqueda Dinamica");
        Observable<ProductResponse> productResponseObservable = null;
        String modelProduct;
        String categoryProduct;
        OriginProduct originProduct;

        if (!params.isEmpty()) {
            if(params.get("originProduct") != null && params.get("modelProduct") != null){
                log.info("Buscando por origen de Producto y modelo");
                originProduct = OriginProduct.valueOf(params.get("originProduct"));
                modelProduct = params.get("modelProduct");
                productResponseObservable = productDao.getData(originProduct,modelProduct);
            }else if (params.get("originProduct") !=null && params.get("modelProduct") == null){
                log.info("Buscando por origen de Producto ");
                originProduct = OriginProduct.valueOf(params.get("originProduct"));
                productResponseObservable = productDao.searchOrigin(originProduct);
            }else if (params.get("originProduct") ==null && params.get("modelProduct") != null){
                log.info("Buscando por modelo de Producto ");
                modelProduct = params.get("modelProduct");
                productResponseObservable = productDao.searchModelProduct(modelProduct);
            }else if (params.get("categoryProduct") !=null && params.get("modelProduct") == null){
                log.info("Buscando por categoria de Producto ");
                categoryProduct = params.get("categoryProduct");
                productResponseObservable = productDao.searchCategoryProduct(categoryProduct);
            }
        }else {
            log.info("Buscando todos los registros");
            productResponseObservable=productDao.findAll();
        }

        return productResponseObservable;
    }
}
