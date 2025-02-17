package com.esig.dao;

import com.esig.model.Tarefa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TarefaDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao_tarefas");

    public void salvar(Tarefa tarefa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();
        em.close();
    }

    public List<Tarefa> listar() {
        EntityManager em = emf.createEntityManager();
        List<Tarefa> tarefas = em.createQuery("FROM Tarefa", Tarefa.class).getResultList();
        em.close();
        return tarefas;
    }
}
