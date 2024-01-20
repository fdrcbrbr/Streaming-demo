package com.Streamer.dao;

import com.Streamer.Initializer.JpaUtil;
import com.Streamer.Model.Film;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import java.util.List;

public class FilmDaoImpl implements FilmDao{
    @Override
    public void save(Film f) {
        EntityManager em = JpaUtil.getFactory().createEntityManager();

        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(f);
            t.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Film> search(String director) {
            EntityManager em = JpaUtil.getFactory().createEntityManager();

            Query q = em.createQuery(" from Film where director= :r");
            q.setParameter("r",director);
            List<Film> result = q.getResultList();

            return result;
        }
}
