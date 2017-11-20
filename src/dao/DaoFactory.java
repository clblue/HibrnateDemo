package dao;

public class DaoFactory
{
    public static ProductDao getProductDaoImpl()
    {
        return new ProductDaoImpl();
    }
}
