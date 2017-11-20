package dao;

import user.Product;

import java.util.List;

public interface ProductDao
{
    void add(Product product);

    void update(Product product);

    void delete(String id);

    Product queryById(String id);

    List<Product> queryAll();
}
