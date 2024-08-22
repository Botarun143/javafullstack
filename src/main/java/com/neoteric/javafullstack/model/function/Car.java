package com.neoteric.javafullstack.model.function;

public class Car {

    private String modelName;
    private String brandName;

    public Car(String modelName,String brandName){

        this.modelName=modelName;
        this.brandName=brandName;

    }

    public String getModelName() {
        return this.modelName;
    }

    public String getBrandName() {
        return this.brandName;
    }
}
