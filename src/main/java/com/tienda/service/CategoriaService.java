/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface CategoriaService {
    //Metodo que obtiene una lista de categorias
    
    public List<Categoria> getCategorias(boolean activo);
    
}
