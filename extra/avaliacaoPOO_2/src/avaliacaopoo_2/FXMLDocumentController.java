/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaopoo_2;

import avaliacaopoo_2.model.Categoria;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author rodrigo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ComboBox<Categoria> cbCategorias;
    
    private List<Categoria> categorias = new ArrayList<>();
    
    private ObservableList<Categoria> obsCategorias;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarCategorias();
    }    
    
    public void carregarCategorias(){
        
        Categoria categoria1 = new Categoria(1, "Bebidas");
        Categoria categoria2 = new Categoria(2, "Comidas");
        
        categorias.add(categoria1);
        categorias.add(categoria2);
        
        obsCategorias = FXCollections.observableArrayList(categorias);
        
        cbCategorias.setItems(obsCategorias);
    }
    
}
