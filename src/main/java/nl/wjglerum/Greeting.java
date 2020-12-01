package nl.wjglerum;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Greeting extends PanacheEntity {

    public String message;

    public static Greeting findById(Long id) {
        return find("id", id).firstResult();
    }
}
