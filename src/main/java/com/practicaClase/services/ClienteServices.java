package com.practicaClase.services;

import com.practicaClase.models.Cliente;
import com.practicaClase.repository.CRUD;
import com.practicaClase.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices extends CRUD<Cliente, ClienteRepository> {

    public ClienteServices(ClienteRepository repository) {
        super(repository);
    }

    @Override
    public List<Cliente> list() {
        return repository.findAll();
    }

    @Override
    public Cliente get(int id) {
        return null;
    }

    @Override
    public void add(Cliente o) {

    }

    @Override
    public void update(Cliente o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
