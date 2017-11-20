package service;

import dao.DaoFactory;
import dao.ProductDao;
import user.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService
{
    private ProductDao dao;

    public void setDao(ProductDao dao) {
        this.dao = dao;
    }

    @Override
    public void addProduct(Product product) {
        if(product == null)
        {
            return;
        }
        if(dao.queryById(product.getId())== null)
        {
            dao.add(product);
        }
        else
        {
            System.out.println("add product failed!");
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if(product == null)
        {
            return;
        }
        if(dao.queryById(product.getId())!= null)
        {
            dao.delete(product.getId());
        }
        else
        {
            System.out.println("delete product failed!");
        }
    }

    @Override
    public void updateProduct(Product product) {
        if(product == null)
        {
            return;
        }
        if(dao.queryById(product.getId())!= null)
        {
            dao.update(product);
        }
        else
        {
            System.out.println("update product failed!");
        }
    }

    @Override
    public Product queryProductById(String id) {
        return dao.queryById(id);
    }

    @Override
    public List<Product> queryAllProduct() {
        return dao.queryAll();
    }
}
