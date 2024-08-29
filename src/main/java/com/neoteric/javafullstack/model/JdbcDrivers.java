package com.neoteric.javafullstack.model;

public class JdbcDrivers {
    public static void main(String[] args) {


        try {
            StudentService es= (StudentService) Class.forName("com.neoteric.javafullstack.model.StudentService").newInstance();
            String callingMethodUsingNewInstance=es.creatingNewObjectWithNewInstance();
            System.out.println("callingMethodUsingNewInstance "+callingMethodUsingNewInstance);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException "+e);
        } catch (InstantiationException e) {
            System.out.println("InstantiationException "+e);

        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException " + e);
        }
            catch (Exception e){
                System.out.println("Exception"+e);
            }

    }
}
