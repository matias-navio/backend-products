package com.matias.springboot.backend.backendproducts.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.matias.springboot.backend.backendproducts.entities.Product;

/*
 * Esta anotación nos permote exponer el repositorio sin escribir mucho
 * código adicional, ya que nos permite persolalizar la ruta, es este caso con product.
 * Cuando usemos esta ruta /product con un metodo GET devuelve findAll
 * si usamos /product/{id} GET devuelve el producto con ese id, etc
 */
@RepositoryRestResource(path = "products")
@CrossOrigin(origins = "http://localhost:5173")
public interface ProductRespository extends CrudRepository<Product, Long>{

}
