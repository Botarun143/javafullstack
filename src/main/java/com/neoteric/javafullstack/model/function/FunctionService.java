package com.neoteric.javafullstack.model.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionService {

    Supplier <Car> carSupplier=()-> new Car("q5 ","audi ");

    Supplier <Employee> employeeSupplier=() -> new Employee("dinesh ","neoteric");

    Supplier <String> supplierAnother=()->{
        return "neoteric";
    };



    Supplier <String> supplierLamb=() -> "neoteric";

    public String functionAsParameterToMethod(Function<String,String> upper,String name)
    {

        return upper.apply(name);
    }


    Function<String,String> upperCaseNameFunc=(name)->
    {
      return name.toUpperCase();
    };

    public String upperCaseName(String name){
        return name.toUpperCase();

    }
    BiFunction<String,String,String> concatBiFunc=(fName,lName)->
    {
      return fName.concat(lName);
    };
    public static void main(String[] arg){
        FunctionService functionService=new FunctionService();

        String upperCase=functionService.upperCaseName("neoteric");
        System.out.println("By method  "+upperCase);

        String upperCaseFunc=functionService.upperCaseNameFunc.apply("neoteric");
        System.out.println("By Function  "+upperCaseFunc);

        String BiFuncName=functionService.concatBiFunc.apply("neoteric","_method");
        System.out.println("By BiFunction  "+BiFuncName);

        String functionAsPar=functionService.functionAsParameterToMethod(functionService.upperCaseNameFunc,"Function is parameter");
        System.out.println("In this Method  "+functionAsPar);

        String supplierFunc=functionService.supplierLamb.get();
        System.out.println("Output using supplier and get  "+supplierFunc);

        Employee employeeSupp= functionService.employeeSupplier.get();
        System.out.println("Output using supplier and get for employee  "+employeeSupp.getFirstName()+employeeSupp.getLastName());

        Car car=functionService.carSupplier.get();
        System.out.println("Output using supplier and get for the car "+car.getBrandName()+car.getModelName());


    }
}
