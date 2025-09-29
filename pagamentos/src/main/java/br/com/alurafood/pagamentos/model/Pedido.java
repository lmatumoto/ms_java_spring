package br.com.alurafood.pagamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pedido {

    private Long id;
    private LocalDateTime dataHora;
    private Status status;
    private List<ItemDoPedido> itens = new ArrayList<>();
}
