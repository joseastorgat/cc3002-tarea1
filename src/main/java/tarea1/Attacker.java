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
    /**
	* method to attack a InfantryUnit
	* 
	* @param infantry InfantryUnit to be attacked
    */
    void attackInfantryUnit(InfantryUnit infantry);
    

    /**
	* method to attack a CavalryUnit 
	* 
	* @param cavalry CavalryUnit to be attacked
    */
    void attackCavalryUnit(CavalryUnit cavalry);
    
    
    /**
	* method to attack a SiegeUnit
	* 
	* @param siege SiegeUnit to be attacked
    */
    void attackSiegeUnit(SiegeUnit siege);
    
    
    /**
	* method to attack a ArcherUnit
	* 
	* @param archer ArcherUnit to be attacked
    */
    void attackArcherUnit(ArcherUnit archer);
    

    /**
	* method to attack a Villager
	* 
	* @param villager Villager to be attacked
    */
    void attackVillager(Villager villager);
    
    /**
	* method to attack a Monk
	* 
	* @param monk Monk to be attacked
    */
    void attackMonk(Monk monk);
    
    /**
	* method to attack a Castle
	* 
	* @param castle Castle to be attacked
    */
    void attackCastle(Castle castle);
    
    /**
	* method to attack a Barrack
	* 
	* @param barrack Barrack to be attacked
    */
    void attackBarrack(Barrack barrack);
   
}
