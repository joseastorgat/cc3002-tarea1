package tarea1;

/**
 * Interface for Entitys.  <br>
 * An Entinty is a object that can be attacked by Attackers Objects
 * @author Jose Astorga
 */
public interface Entity {

    /**
     * method to obtain the actual HitPoints/hp (a.k.a. Life Points or Health Points) of the object.
     *
     * @return HitPoints of the object
     */
    
    double getHp();

    /**
     * method to obtain the maximum amount of hp that the object can have.
     *
     * @return double Max HitPoint of the object
     */

    double getMaxHp();


    /**
     * method to deal damage to the object. Deal damage consist in a reduction of hp.
     * @param damage Damage delivered to the object
     */
    void receiveDamage(double damage);


    /**
     * method to deal with a healing action. healing consist in an increase of hp.
     * A healing can be received only if the object is alive.
     * @param health  Health delivered to the object
     */    
    void heal(double health);


    /**
     * method to check if the entity is live. The object is alive if his hp is a positive non zero (hp>0) .
     *
     * @return Boolean indicating if the entity isAlive ( True if is alive, False otherwise)
     */
    boolean isAlive();

    /**
     * method to deal with an attack from an ArcherUnit object.
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
     * @param infantry InfantryUnit attacking the object
     */
    void attackedByInfantry(InfantryUnit infantry);
    
    /**
     * method to deal with an attack from a Monk
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