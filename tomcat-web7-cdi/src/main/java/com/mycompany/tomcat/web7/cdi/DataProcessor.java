/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tomcat.web7.cdi;

/**
 *
 * @author denys.prokopiuk
 */
public class DataProcessor implements Processor {

    @Override
    public void process() {
        System.out.println("Processing data");
    }

}
