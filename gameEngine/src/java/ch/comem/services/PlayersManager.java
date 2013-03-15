/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.comem.services;

import javax.ejb.Stateless;

/**
 *
 * @author Leo
 */
@Stateless
public class PlayersManager implements PlayersManagerLocal {

    @Override
    public void createPlayer(String firsName, String lastName, String email, int numberOfPoints, String badges) {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
