package br.com.fiap.market_list.item;

import br.com.fiap.market_list.listaDeCompras.Lista;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "title")
    private String title;

    @NotBlank
    @Column(name = "qtde")
    private Number qtde;

    @ManyToOne
    @JoinColumn(name = "lista_id") // Coluna que faz a associação com Lista
    private Lista lista;

    public Item() {
    }

    public Item(String title, Number qtde) {
        this.title = title;
        this.qtde = qtde;
    }

    // Outros métodos, getters e setters...
}
