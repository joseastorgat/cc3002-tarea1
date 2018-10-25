package tarea1;

/**
 * CavalryUnit is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class CavalryUnit extends AbstractUnit{
	
	public CavalryUnit(double hp, double attackpoints){
        super(hp, attackpoints);
	}
	
	@Override
	public void attack(Entity entity){
		entity.attackedByCavalry(this);
    }

	@Override
    public void attackedByArcher(ArcherUnit archer){
    	this.receiveDamage(archer.getAttackPoints() * 1.0);
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.receiveDamage(cavalry.getAttackPoints()*1.0);
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.receiveDamage(castle.getAttackPoints()*1.2);
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
    	this.receiveDamage(infantry.getAttackPoints()*1.2);
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.receiveDamage(siege.getAttackPoints()*1.0);
	}
    
    @Override
    public void attackedByVillager(Villager villager){
    	this.receiveDamage(villager.getAttackPoints()*0.5);
	}


}