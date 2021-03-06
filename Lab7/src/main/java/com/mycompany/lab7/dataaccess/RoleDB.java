package com.mycompany.lab7.dataaccess;

import com.mycompany.lab7.models.Role;
import java.util.List;
import javax.persistence.*;

public class RoleDB {

    public List<Role> getAll() throws Exception {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Query query = em.createNamedQuery("Role.findAll");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
