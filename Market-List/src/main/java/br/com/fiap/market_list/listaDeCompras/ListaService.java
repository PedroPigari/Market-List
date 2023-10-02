package br.com.fiap.market_list.listaDeCompras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaService {

    @Autowired
    ListaRepository repository;

    public List<Lista> findAll() {
        return repository.findAll();
    }

    public boolean delete(Long id) {
        var lista = repository.findById(id);
        if (lista.isEmpty())
            return false;

        repository.deleteById(id);
        return true;
    }
}