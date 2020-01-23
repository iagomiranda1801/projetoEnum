/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Iago
 */
public class orderOfRequest {
    
    public Integer id;
    public Date data;
    public OrderStatus status;
    
    public orderOfRequest(){
        
    }

    public orderOfRequest(Integer id, Date data, OrderStatus status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "orderOfRequest{" + "id=" + id + ", data=" + data + ", status=" + status + '}';
    }
    
    
    
}
