package tarea1;

/**
 * AbstractAttacker is an abstract class for objects that attacks
 *
 * @author Jose Astorga
 */


public abstract class AbstractAttacker extends AbstractAttackable implements Attacker{
	private double attackpoints;

	public AbstractAttacker (hp, maxHP, attackpoints){
		super(hp, maxHP);
		this.attackpoints = attackpoints;
	}
	
	@Override
	public getAttackPoints(){
		return attackpoints;
	}

	@Override
	public attack(Entitity entity){
		entity.attackedBy(this);

	}

	@Override
	public attackMonk(Monk monk){
		monk.receiveDamage(monk.getHp());

	}
}
