/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elboina.reservations.hotel.rest.api.spring.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author Moi
 */
@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration(){
        packages("com.elboina.reservations.hotel.rest.api.ws");
    }
    
}
