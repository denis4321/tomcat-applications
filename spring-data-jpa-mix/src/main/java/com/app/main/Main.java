/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.main;

import com.app.config.MySpringConfig;
import org.springframework.boot.SpringApplication;

/**
 *
 * @author Denys.Prokopiuk
 */
public class Main {
    
    public static void main(String[] args) {
         SpringApplication.run(MySpringConfig.class, args);
    }
    
}
