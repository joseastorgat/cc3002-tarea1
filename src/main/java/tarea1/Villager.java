package tarea1;

/**
 * Villager is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class Villager extends AbstractUnit{

	public Villager(double hp, double attackpoints){
        super(hp, attackpoints);
	}

	@Override
	public void attack(Entity entity){
		entity.attackedByVillager(this);
    }


	@Override
    public void attackedByArcher(ArcherUnit archer){
    	this.receiveDamage(archer.getAttackPoints() *1.5);
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.receiveDamage(cavalry.getAttackPoints()*1.5);
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.receiveDamage(castle.getAttackPoints()*1.2);
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
    	this.receiveDamage(infantry.getAttackPoints()*1.5);
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.receiveDamage(siege.getAttackPoints()*1.5);
	}
    
    @Override
    public void attackedByVillager(Villager villager){
    	this.receiveDamage(villager.getAttackPoints()*1.0);
	}


}
