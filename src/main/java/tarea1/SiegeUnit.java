package tarea1;

/**
 * SiegeUnit is an AbstractUnit
 *
 * @author Jose Astorga
 */


public class SiegeUnit extends AbstractUnit{
	/**
	 * SiegeUnit Constructor
	 *
	 *  @param hp  Initial HitPoints of the object.
	 * 	@param attackpoints  AttackPoints of the object.
	 */
	public SiegeUnit(double hp, double attackpoints){
		super(hp, attackpoints);
	}

	@Override
	public void attack(Entity entity){

		if(this.isAlive()){
			entity.attackedBySiegeUnit(this);
		}
    }
	
	@Override
    public void attackedByArcher(ArcherUnit archer){
    	this.receiveDamage(archer.getAttackPoints() *0.8);
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.receiveDamage(cavalry.getAttackPoints()* 1.2);
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.receiveDamage(castle.getAttackPoints()*0.5);
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
    	this.receiveDamage(infantry.getAttackPoints()*1.2);
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.receiveDamage(siege.getAttackPoints()*1.5);
	}
    
    @Override
    public void attackedByVillager(Villager villager){
    	this.heal(villager.getAttackPoints()*0.5);
	}
	@Override
	public void attackedByMonk(Monk monk){}

}
