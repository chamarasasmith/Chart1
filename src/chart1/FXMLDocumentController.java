/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart1;

import java.net.URL;
import java.util.ResourceBundle;

import java.util.Vector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<Student> table;
    @FXML private TableColumn<Student,Integer> id;
    @FXML private TableColumn<Student,String> month1;
    @FXML private TableColumn<Student,Double> income;
    @FXML private PieChart pieChart;
    
    ObservableList<Student> list=FXCollections.observableArrayList(
    
            new Student(1, "Jan", 1000.0),
            new Student(2, "Feb", 2000.0),
            new Student(3, "Mar", 8000.0),
            new Student(4, "Apr", 6000.0),
            new Student(5, "May", 4000.0),
            new Student(6, "Jun", 5000.0)
    
    );

   @FXML
    private void btn(ActionEvent event) {
        
        
        
        ObservableList<Student> items = table.getItems();
        
        System.out.println(items.get(0).getId());
        
        ObservableList<PieChart.Data> list1=FXCollections.observableArrayList();
        
        for (int i = 0; i < table.getItems().size(); i++) {
        
            
            
            String id1 = items.get(i).getMonth1();
            Double income1 = items.get(i).getIncome();
            System.out.println(id1);
            
            list1.add(new PieChart.Data(id1, income1));
            
       }
        pieChart.setData(list1);
    }
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
        id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
        month1.setCellValueFactory(new PropertyValueFactory<Student,String>("month1"));
        income.setCellValueFactory(new PropertyValueFactory<Student,Double>("income"));
        table.setItems(list);
 
    }    
    
}
