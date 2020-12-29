package main;

import function.SupplierExample;

public class SupplierMain {

    public static void main(String[] args) {

        System.out.println(SupplierExample.getConnectionUrl());
        System.out.println(SupplierExample.getConnectionUrlSupplier.get());
    }
}
