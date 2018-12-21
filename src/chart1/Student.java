/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart1;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
public class Student {
    
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty month1;
    private final SimpleDoubleProperty income;

    public Student(Integer id, String month1, Double income) {
        this.id = new SimpleIntegerProperty(id);
        this.month1 = new SimpleStringProperty(month1);
        this.income = new SimpleDoubleProperty(income);
    }

    public Integer getId() {
        return id.get();
    }

    public String getMonth1() {
        return month1.get();
    }

    public Double getIncome() {
        return income.get();
    }
   
   
    
    
    
}
