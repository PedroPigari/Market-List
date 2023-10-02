package br.com.fiap.market_list.listaDeCompras;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.market_list.item.Item;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lista") // Define a relação entre Lista e Item
    private List<Item> itens;

    public Lista() {
        this.itens = new ArrayList<>();
    }

    // Outros métodos, getters e setters...
}
