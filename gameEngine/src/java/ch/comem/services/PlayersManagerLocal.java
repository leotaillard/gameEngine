/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.comem.services;

import javax.ejb.Local;

/**
 *
 * @author Leo
 */
@Local
public interface PlayersManagerLocal {

    Long createPlayer(String firsName, String lastName, String email, int numberOfPoints);

    Long addBadge(int badgeId, int playerId);
    
}
