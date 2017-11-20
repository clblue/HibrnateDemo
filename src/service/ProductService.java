package service;

import user.Product;

import java.util.List;

public interface ProductService
{
    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(Product product);

    Product queryProductById(String id);

    List<Product> queryAllProduct();
}
