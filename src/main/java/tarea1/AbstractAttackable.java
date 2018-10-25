package tarea1;


/**
 * AbstractAttackable is an abstract class for objects that can receive attacks
 *
 * @author Jose Astorga
 */


public abstract class AbstractAttackable implements Entity{
	private double maxHP;
	private double hp;

	public AbstractAttackable( hp, maxHP){
		this.maxHP = maxHP;
		this.hp = hp;
	}
	
	@Override
	public double getHp(){
		return hp;
	}

	@Override
	public double getMaxHp(){
		return maxHP;
	}

	@Override 
	public boolean isAlive(){
		return hp>0;
	}

	@Override 
	public void receiveDamage(double damage){
		if((hp-=damage)<0){
			hp = 0;
		}
	}
	
	@Override 
	public void heal(double health){
		if this.isAlive(){
			if((hp+=health)>maxHP){
				hp = getMaxHp;
			}
		}
	}
}