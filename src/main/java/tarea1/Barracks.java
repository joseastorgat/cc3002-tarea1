package tarea1;

/**
 * Barracks is an AbstractAttackable
 *
 * @author Jose Astorga
 */

public class Barracks extends AbstractAttackable{
    private static final double BARRACK_HP=500;

	/**
	 * Barracks Constructor.<br>
	 * Barracks have a fixed initial_hp value equal to 500.<br>
	 * Castle's maxHP is equal to his initial_hp.
	 */
	public Barracks(){
		super(BARRACK_HP, BARRACK_HP);
	}

	@Override
    public void attackedByArcher(ArcherUnit archer){
    	this.receiveDamage(archer.getAttackPoints()*0.7);
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.receiveDamage(cavalry.getAttackPoints()*0.7);
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.receiveDamage(castle.getAttackPoints()*0.7);
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
    	this.receiveDamage(infantry.getAttackPoints()*0.7);
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.receiveDamage(siege.getAttackPoints()*2.0);
	}
    
    @Override
    public void attackedByVillager(Villager villager){
    	this.heal(villager.getAttackPoints()*0.7);
	}

	@Override
	public void attackedByMonk(Monk monk){}


}
