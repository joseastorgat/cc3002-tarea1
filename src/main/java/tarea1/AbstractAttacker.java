package tarea1;

/**
 * AbstractAttacker is an abstract class for objects that attacks
 *
 * @author Jose Astorga
 */

public abstract class AbstractAttacker extends AbstractAttackable implements Attacker{
	private double attackpoints;

	public AbstractAttacker (double hp, double maxHP, double attackpoints){
		super(hp, maxHP);
		this.attackpoints = attackpoints;
	}
	
	public double getAttackPoints(){
		return this.attackpoints;
	}

	public abstract void attack(Entity entity);

}
