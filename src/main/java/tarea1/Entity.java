package tarea1;


import tarea1.Attacker;

/**
 * Interface for Entity
 *
 * @author Jose Astorga
 */
public interface Entity {

    /**
     * method to obtain the actual HitPoints of the object
     *
     * @return HitPoints of the object
     */
    
    double getHp();

    /**
     * method to obtain the max Hitpoint of the object
     *
     * @return maxHitPoints of the object
     */

    double getMaxHp();


    /**
     * method to deal with a attack to the object
     *
     * @param damage Damage delivered to the object
     */
    void receiveDamage(double damage);


    /**
     * method to deal with an 
     *
     * @param health  Health delivered to the object
     */    
    void heal(double health);


    /**
     * method to check if the entity is live ( hp>0 )
     
     * @return  Boolean indicating if the entity isAlive 
     */
    boolean isAlive();


    /**
     * method to deal with an attack to the Object
     *
     * @param attacker Attacker attacking the Object
     */

    void attackedBy(Attacker attacker);

}
