package com.neoteric.javafullstack.model;

public class HelloWorldVMArguments {

        public static void main(String[] arg){

            String dinnu=System.getProperty("companyname");
            String name=System.getProperty("myname");
            System.out.println("   Hello worldVM arguments =="+dinnu+","+name);
            String envName=System.getenv("myownenv");
            System.out.println("   Hello worldVM arguments =="+envName);
            String otherEnvName=System.getenv("otherenv");
            System.out.println("   Hello worldVM arguments =="+otherEnvName);

        }
    }


