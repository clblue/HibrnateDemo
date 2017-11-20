package service;

public class ServiceFactory
{
    public static ProductService getProductServiceInstance()
    {
        return new ProductServiceImpl();
    }
}
