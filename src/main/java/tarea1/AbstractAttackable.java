package tarea1;


/**
 * AbstractAttackable is an abstract class for Entity's
 *
 * @author Jose Astorga
 */

public abstract class AbstractAttackable implements Entity{
	private double maxHP;
	private double hp;


	/**
	 * AbstractAttackable Constructor
	 *
	 * @param hp  Initial HitPoints of the object.
	 * @param maxHP Maximum amount of Hitpoint that the object can have.
	 */
	public AbstractAttackable (double hp, double maxHP){
		this.maxHP = maxHP;
		this.hp = hp;
	}

	/**
	 * method to get the hp of the object.
 	 * @return double hp - actual HitPoints of the Object.
	 */

    @Override
    public double getHp(){
		return hp;
	}


	/**
	 * method to get the maximum amount of HitPoint the object can have.
	 * @return double maxHP: maximum amount HitPoint the object can have.
	 */

    @Override
	public double getMaxHp(){
		return maxHP;
	}

	/**
	 * method to check if the object is alive. An object is alive if their hp > 0.
	 * @return True if the object is alive ( hp>), False otherwise.
	 */
    @Override
	public boolean isAlive(){
		return hp>0;
	}

	/**
	 * method to deal damage to the object.
	 * Deal damage consist in a reduction of hp.
	 * new_hp = actual_hp - damage.
	 * @param damage Damage delivered to the object
	 */

    @Override
	public void receiveDamage(double damage){
		if((hp-=damage)<0){
			hp = 0;
		}
	}
	/**
	 * method to deal with a healing action. Healing consist in an increase of hp.
	 * A healing can be received only if the object is alive.
	 * new_hp = max(max_hp, hp + health)
	 * @param health  Health delivered to the object
	 */
    @Override
	public void heal(double health){
		if (this.isAlive()){
			if((hp+=health)>maxHP){
				hp = getMaxHp();
			}
		}
	}

    /**
     * method to deal with an attack from a Monk.
     * Monk heals when attack. The amount healed is equal to monk attack points * 0.5
     *
	 * @param monk Monk attacking the object
     */

    @Override
    public void attackedByMonk(Monk monk){
    	this.heal( monk.getAttackPoints() * 0.5);
    }

	/**
	 * method to deal with an attack from an ArcherUnit.
	 *
	 * @param archer ArcherUnit attacking the object
	 */
	@Override
    public abstract void attackedByArcher(ArcherUnit archer);

	/**
	 * method to deal with an attack from an CavalryUnit.
	 *
	 * @param cavalry CavalryUnit attacking the object.
	 */
    @Override
    public abstract void attackedByCavalry(CavalryUnit cavalry);

	/**
	 * method to deal with an attack from an Castle.
	 *
	 * @param castle Castle attacking the object.
	 */
	@Override
    public abstract void attackedByCastle(Castle castle);


	/**
	 * method to deal with an attack from an InfantryUnit.
	 *
	 * @param infantry InfantryUnit attacking the object.
	 */
    @Override
	public abstract void attackedByInfantry(InfantryUnit infantry);

	/**
	 * method to deal with an attack from an SiegeUnit.
	 *
	 * @param siege SiegeUnit attacking the object
	 */
	@Override
    public abstract void attackedBySiegeUnit(SiegeUnit siege);

	/**
	 * method to deal with an attack from an Villager.
	 *
	 * @param villager Villager object attacking the object
	 */
	@Override
    public abstract void attackedByVillager(Villager villager);

}