package com.dsa.DSAProblems.controller;

import com.dsa.DSAProblems.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import utils.TemplateData;

@RestController
//@CrossOrigin(origins = {"http://localhost:9191, http://localhost:4200"}, maxAge = 3600)
public class ProductController {

    @Autowired
    private TemplateService productService;

    @PostMapping("/addTemplate")
    public TemplateData addProduct(@RequestBody TemplateData templateData) {
        return productService.createTemplate(templateData);
    }
//
//    @PostMapping("/addProducts")
//    public List<TemplateData> addProduct(@RequestBody List<TemplateData> products) {
//        return productService.saveProducts(products);
//    }
//
//    @GetMapping("/products")
//    public List<TemplateData> findAllProducts() {
//        return productService.getProducts();
//    }
//
//    @GetMapping("/productById/{id}")
//    public TemplateData findProductById(@PathVariable int id) {
//        return productService.getProductById(id);
//    }
//
//    @GetMapping("/productByName/{name}")
//    public TemplateData findProductByName(@PathVariable String name) {
//        return productService.getProductByName(name);
//    }
//
//    @PutMapping("/update")
//    public TemplateData updateProduct(@RequestBody Product product) {
//        return productService.updateProduct(product);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return productService.deleteProduct(id);
//    }
//
//    @DeleteMapping("/deleteByIds")
//    public String deleteProducts(@RequestBody List<Integer> ids) {
//        return productService.deleteProducts(ids);
//    }
}
