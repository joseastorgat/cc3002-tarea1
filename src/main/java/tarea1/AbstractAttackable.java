package tarea1;


/**
 * AbstractAttackable is an abstract class for objects that can receive attacks
 *
 * @author Jose Astorga
 */


public abstract class AbstractAttackable implements Entity{
	private double maxHP;
	private double hp;

	public AbstractAttackable (double hp, double maxHP){
		this.maxHP = maxHP;
		this.hp = hp;
	}
	
	public double getHp(){
		return hp;
	}

	public double getMaxHp(){
		return maxHP;
	}

	public boolean isAlive(){
		return hp>0;
	}

	public void receiveDamage(double damage){
		if((hp-=damage)<0){
			hp = 0;
		}
	}
	
	public void heal(double health){
		if (this.isAlive()){
			if((hp+=health)>maxHP){
				hp = getMaxHp();
			}
		}
	}

    public abstract void attackedByArcher(ArcherUnit archer);
	
    public abstract void attackedByCavalry(CavalryUnit cavalry);
	
    public abstract void attackedByCastle(Castle castle);

	public abstract void attackedByInfantry(InfantryUnit infantry);
    
    public void attackedByMonk(Monk monk){
    	this.heal( monk.getAttackPoints() * 0.5);
    }
    
    public abstract void attackedBySiegeUnit(SiegeUnit siege);
    
    public abstract void attackedByVillager(Villager villager);

}