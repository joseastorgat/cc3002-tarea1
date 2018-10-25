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
     * method to deal with an attack from an ArcherUnit
     *
     * @param archer ArcherUnit attacking the object
     */
    void attackedByArcher(ArcherUnit archer);
    
    /**
     * method to deal with an attack from a CavalryUnit
     *
     * @param cavalry CavalryUnit attacking the object
     */
    void attackedByCavalry(CavalryUnit cavalry);
    
    /**
     * method to deal with an attack from a Castle Building
     *
     * @param castle Castle attacking the object
     */
    void attackedByCastle(Castle castle);
    
    /**
     * method to deal with an attack from an InfantryUnit
     *
     * @param infatry InfantryUnit attacking the object
     */
    void attackedByInfantry(InfantryUnit infantry);
    
    /**
     * method to deal with an attack from a Archer
     *
     * @param monk Monk attacking the object
     */
    void attackedByMonk(Monk monk);
    
    /**
     * method to deal with an attack from a SiegeUnit
     *
     * @param siege SiegeUnit attacking the object
     */
    void attackedBySiegeUnit(SiegeUnit siege);
    
    /**
     * method to deal with an attack from a Villager
     *
     * @param villager Villager object attacking the object
     */
    void attackedByVillager(Villager villager);

}
