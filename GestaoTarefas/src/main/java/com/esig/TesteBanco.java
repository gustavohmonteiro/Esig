package com.esig;

public class TesteBanco {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo("Finalizar o projeto");
        tarefa.setDescricao("Implementar a parte obrigatória do desafio.");
        tarefa.setResponsavel("João");
        tarefa.setPrioridade("Alta");
        tarefa.setStatus("Em andamento");

        TarefaRepository.salvarTarefa(tarefa);
        System.out.println("Tarefa salva com sucesso!");
    }
}
