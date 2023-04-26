package com.javatpointer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class ProductService implements IProductService
{
    //ArrayList<Product> products = new ArrayList<Product>();
    @Override
    public List<Product> findAll()
    {
//creating an object of ArrayList
       ArrayList<Product> products = new ArrayList<Product>();
//adding products to the List
        products.add(new Product(100, 222,333,444,555));
        products.add(new Product(101, 223,224,4443,2223));
        products.add(new Product(102, 2231,2214,443,223));
        products.add(new Product(103, 31,24,431,211));
        //returns a list of product
        return products;
    }
    public List<Product> update(float first,float second, float third, float fourth, float fifth){
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(first, second,third,fourth,fifth));
        return products;
    }

}