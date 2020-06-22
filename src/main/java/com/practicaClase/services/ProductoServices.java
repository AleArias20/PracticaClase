package com.practicaClase.services;

import com.practicaClase.models.Producto;
import com.practicaClase.repository.CRUD;
import com.practicaClase.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServices extends CRUD<Producto, ProductoRepository>{

    public ProductoServices(ProductoRepository repostory) {
        super(repostory);
    }

    @Override
    public List<Producto> list() {
        return repository.findAll();
    }

    @Override
    public Producto get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Producto o) {
        repository.save(o);
    }

    @Override
    public void update(Producto o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
