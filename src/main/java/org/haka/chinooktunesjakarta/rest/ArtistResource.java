package org.haka.chinooktunesjakarta.rest;

import org.haka.chinooktunesjakarta.model.Artist;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/artists")
public class ArtistResource {

    @PersistenceContext
    private EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Artist> getAllArtists() {
        return entityManager.createQuery("SELECT a FROM Artist a", Artist.class).getResultList();
    }
}

