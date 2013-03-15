/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.comem.services;

import ch.comem.models.Badge;
import ch.comem.models.Player;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leo
 */
@Stateless
public class PlayersManager implements PlayersManagerLocal {
    @PersistenceContext(unitName = "challengeMePU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Long createPlayer(String firsName, String lastName, String email, int numberOfPoints) {
        
        Player player = new Player();
        
        player.setFirstName(firsName);
        player.setLastName(lastName);
        player.setEmail(email);
        player.setNumberOfPoints(numberOfPoints);
        
        em.persist(player);
        em.flush();
        
        return player.getId();
    }

    @Override
    public Long addBadge(int badgeId, int playerId) {
        
        Player player = new Player();
        Badge badge = new Badge();
        
        em.persist(player);
        em.persist(badge);
        
        player.addBadge(badge);
        em.flush();
        
        return player.getId();
    }

    


}
