/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.model;

import java.io.Serializable;

/**
 *
 * @author 209043946
 */
public class EmployeeModel implements Serializable{
    
    private Long id;
    private int emp_id;
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
   
    
}