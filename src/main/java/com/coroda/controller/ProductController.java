package com.coroda.controller;

import com.coroda.dto.request.ProductRequest;
import com.coroda.dto.response.ProductResponse;
import com.coroda.service.ProductService;
import com.coroda.util.Constants;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(Constants.MAIN_PATH)
@Api(tags = "Microservicio Product", description = "Esta API se encarga de la gestion de las productos")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    @ApiOperation(value = Constants.SAVE_VALUE, notes = Constants.SAVE_NOTE)
    public Completable save(@RequestBody ProductRequest model){
        log.info("Envio de parametros");
        return productService.save(model);
    }

    @DeleteMapping(Constants.ID)
    @ApiOperation(value = Constants.DELETE_ID_VALUE, notes = Constants.DELETE_ID_NOTE)
    public Completable delete(@PathVariable("id") Long id){
        log.info("Eliminar datos por id");
        return  productService.delete(id);
    }

    @PutMapping(Constants.ID)
    @ApiOperation(value = Constants.UPDATE_ID_VALUE, notes = Constants.UPDATE_ID_NOTE)
    public Completable update(@RequestBody ProductRequest model){
        log.info("Actualizacion de parametros");
        return productService.update(model);
    }

    @GetMapping(Constants.ID)
    @ApiOperation(value = Constants.GET_ID_VALUE, notes = Constants.GET_ID_NOTE)
    public Single<ProductResponse> getById(@PathVariable("id")Long id){
        log.info("Obtencion de datos por id");
        return productService.getById(id);
    }

    @GetMapping(Constants.MODEL)
    @ApiOperation(value = Constants.GET_ID_VALUE, notes = Constants.GET_ID_NOTE)
    public Observable<ProductResponse> getByModel(@PathVariable("model")String model){
        log.info("Obtencion de datos por id");
        return productService.getByModel(model);
    }

    @GetMapping
    @ApiOperation(value = Constants.GETDATA_VALUE, notes = Constants.GETDATA_NOTE)
    public Observable<ProductResponse> getData(@RequestParam Map<String, String> params) {
        log.info("Enviando parametros de busqueda");
        return productService.getData(params);
    }

}