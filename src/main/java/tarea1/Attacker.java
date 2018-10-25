package tarea1;

/**
 * Interface for Attackers
 * An Attacker is an object that can attack Entity Objects
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
