package com.esig;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TarefaRepository {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestaoTarefasPU");

    public static void salvarTarefa(Tarefa tarefa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Tarefa> listarTarefas() {
        EntityManager em = emf.createEntityManager();
        List<Tarefa> tarefas = em.createQuery("SELECT t FROM Tarefa t", Tarefa.class).getResultList();
        em.close();
        return tarefas;
    }
}
