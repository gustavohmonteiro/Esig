package com.esig.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String responsavel;
    private String prioridade;
    private Date deadline;
    private boolean concluida;

    // Getters e Setters
}
