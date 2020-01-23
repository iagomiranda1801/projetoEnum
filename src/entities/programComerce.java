/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

public class programComerce {
    
    public static void main (String[] args) {
        
        orderOfRequest order = new orderOfRequest (1000, new Date(), OrderStatus.PENDING_PAYMENT);
        
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DEVILERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
      
        
        System.out.println(os1);
        System.out.println(os2);
        
        
    }
    
}
