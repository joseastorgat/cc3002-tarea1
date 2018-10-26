package tarea1;

/**
 * Castle is an AbstractAttacker
 *
 * @author Jose Astorga
 */

public class Castle extends AbstractAttacker{
    private static final double CASTLE_HP=1000;
    private static final double CASTLE_ATTACKPOINT=20;

	/**
	 * Castle Constructor.<br>
	 * Castle's have a fixed initialHp value equal to 1000.<br>
	 * Castle's have a fixed attackpoints value equal to 20.<br>
	 * Castle's maxHP is equal to his initial_hp.<br>
	 */
	public Castle(){
        super(CASTLE_HP, CASTLE_HP, CASTLE_ATTACKPOINT);
	}

	public void attack(Entity entity){
		if(this.isAlive())
		{
		    entity.attackedByCastle(this);
		}
    }

	@Override
    public void attackedByArcher(ArcherUnit archer){
    	this.receiveDamage(archer.getAttackPoints() *0.1);
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.receiveDamage(cavalry.getAttackPoints()* 0.3);
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.receiveDamage(castle.getAttackPoints()*0.1);
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
    	this.receiveDamage(infantry.getAttackPoints()*0.3);
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.receiveDamage(siege.getAttackPoints()*2.0);
	}
    
    @Override
    public void attackedByVillager(Villager villager){
    	this.heal(villager.getAttackPoints()*0.3);
	}	
	@Override
	public void attackedByMonk(Monk monk){}

}
