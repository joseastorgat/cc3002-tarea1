package tarea1;

import tarea1.Entity;

/**
 * Interface for Attackers
 *
 * @author Jose Astorga
 */

public interface Attacker extends Entity {

	 /**
     * method to obtain the AttackPoints of the object
     *
     * @return AttackPoints of the object
     */
 
    double getAttackPoints();

	 /**
     * method to attack an Entity object
     *
	 * @param entity Enitity to be attacked 
     */
    void attack(Entity entity);   
}
