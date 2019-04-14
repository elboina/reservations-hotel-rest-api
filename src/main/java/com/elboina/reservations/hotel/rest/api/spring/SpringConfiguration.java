package com.elboina.reservations.hotel.rest.api.spring;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Configuration spring du projet
 * @author elboina
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.elboina")
@EnableJpaRepositories(basePackages = "com.elboina")
public class SpringConfiguration {
   @Bean
   public EntityManagerFactory entityManagerFactory() {
       return Persistence.createEntityManagerFactory("reservation_PU");
   }
   
   @Bean
   public PlatformTransactionManager transactionManager() {
       JpaTransactionManager transactionManager = new JpaTransactionManager();
       transactionManager.setEntityManagerFactory(entityManagerFactory());
       return transactionManager;
   }
}
