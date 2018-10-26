package tarea1;

/**
 * AbstractAttacker is an abstract class for Attacker.
 * AbstractAttacker extends AbstractAttackables.
 * @author Jose Astorga
 */

public abstract class AbstractAttacker extends AbstractAttackable implements Attacker{
	private double attackpoints;


	/**
	 * AbstractAttackable Constructor
	 *
	 * @param hp  Initial HitPoints of the object.
	 * @param maxHP Maximum amount of Hitpoint that the object can have.
	 * @param attackpoints  AttackPoints of the object.
	 */
	public AbstractAttacker (double hp, double maxHP, double attackpoints){
		super(hp, maxHP);
		this.attackpoints = attackpoints;
	}

	/**
     * method to obtain the AttackPoints of the object
     *
     * @return AttackPoints of the object
     */	

 	@Override
	public double getAttackPoints(){
		return this.attackpoints;
	}
	

	/**
     * smethod to attack another Entity object
     *
     * @param entity Entity object to be attacked
     */
 	@Override
	public abstract void attack(Entity entity);

}
