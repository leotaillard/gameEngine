/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.comem.test;

import ch.comem.services.PlayersManagerLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author Leo
 */
@Stateless
@WebService
public class TestPlayersManager implements TestPlayersManagerLocal {
    @EJB
    private PlayersManagerLocal playersManager;

    @Override
    public void addPlayer(String firstName) {
        
        for(int i=0;i<100;i++){
        
            playersManager.createPlayer("Paul", firstName, "url", i);
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void addBadgeToPlayer(int idPlayer, int idBadge) {
        
        playersManager.addBadge(idPlayer, idBadge);
        
    }

}
