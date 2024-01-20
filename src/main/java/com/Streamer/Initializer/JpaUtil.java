package com.Streamer.Initializer;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emF;

    static{
        emF = Persistence.createEntityManagerFactory("Streamer");
    }
    public static EntityManagerFactory getFactory(){
        return emF;
    }
}
