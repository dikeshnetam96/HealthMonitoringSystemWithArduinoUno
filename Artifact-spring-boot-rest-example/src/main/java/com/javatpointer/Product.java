package com.javatpointer;

public class Product {
        private float id;
        private float pname;
        private float batchno;
        private float price;
        private float noofproduct;
//default constructor
public Product()
        {

        }
//constructor using fields
public Product(float id, float pname, float batchno, float price, float noofproduct)
        {
            super();
            this.id = id;
            this.pname = pname;
            this.batchno = batchno;
            this.price = price;
            this.noofproduct = noofproduct;
        }

        public Product addProduct(Product pd){
        id = pd.id;
        pname=pd.pname;
        batchno=pd.batchno;
        price=pd.price;
        noofproduct=pd.noofproduct;
        return pd;
        }
//getters and setters
        public float getId()
        {
            return id;
        }
        public void setId(float id)
        {
            this.id = id;
        }
        public float getPname()
        {
            return pname;
        }
        public void setPname(float pname)
        {
            this.pname = pname;
        }
        public float getBatchno()
        {
            return batchno;
        }
        public void setBatchno(float batchno)
        {
            this.batchno = batchno;
        }
        public float getPrice()
        {
            return price;
        }
        public void setPrice(float price)
        {
            this.price = price;
        }
        public float getNoofproduct()
        {
            return noofproduct;
        }
        public void setNoofproduct(float noofproduct)
        {
            this.noofproduct = noofproduct;
        }
    }
