package com.amitpamecha.bridge.demo;

public class MotorenCar extends Car {

    private Product product;
    private String carType;

    public MotorenCar(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + carType);

    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product " + product.productName() + " according to " + carType);

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
