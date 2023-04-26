package com.javatpointer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
    ArrayList<TempClass> temp = new ArrayList<TempClass>();
    @Autowired
    private IProductService productService;
    private Product pd;
    public ProductService ps;// = new ProductService();
    //mapping the getProduct() method to /product

    @CrossOrigin
    @GetMapping(value = "/product")
    public List<Product> getProduct()
    {
//finds all the products
        List<Product> products = productService.findAll();
//returns the product list
        return products;
    }

    @CrossOrigin
    @PostMapping("/product")
    public Product postRequest(@RequestBody Product prd){
       System.out.println(prd.getId());
   //     ps.update(prd.getId(),prd.getBatchno(),prd.getNoofproduct(),prd.getPname(),prd.getNoofproduct());
     //   temp.addAll(ps.products);
        /// Product p = this.pd.addProduct(product);
        System.out.println(prd);
        temp.add(new TempClass(prd.getId(),prd.getBatchno(),prd.getNoofproduct(),prd.getPname(),prd.getNoofproduct()));
        return prd;
    }

    @CrossOrigin
    @PostMapping("/sensorData")
public String postRequest(@RequestBody TempClass t){
    temp.add(new TempClass(t.getBodyTemp(),t.getHeartRate(),t.getHumidity(),t.getRoomTemp(),t.getSpo2()));
    return "Done";
}

    @CrossOrigin
    @GetMapping(value = "/realtimedata")
    public List<TempClass> getRealTimeData()
    {
     //   System.out.println(temp.);
        //System.out.print(temp.size());
        if(temp.size()==2) temp.remove(0);
        return temp;
    }
}