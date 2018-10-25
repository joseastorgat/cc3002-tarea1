package tarea1;

/**
 * Monk is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class Monk extends AbstractUnit{
	private static final double MONK_INIT_HP=9000;
	private static final double MONK_HEAL_FACTOR=20;


	public Monk(){
		super(MONK_INIT_HP, MONK_HEAL_FACTOR);
	}

	@Override
	public void attack(Entity entity){
		entity.attackedByMonk(this);
    }

	@Override

    public void attackedByArcher(ArcherUnit archer){
    	this.dieInstantly();
    }
	
	@Override
    public void attackedByCavalry(CavalryUnit cavalry){
    	this.dieInstantly();
    }
	
	@Override
    public void attackedByCastle(Castle castle){
    	this.dieInstantly();
    }

    @Override
	public void attackedByInfantry(InfantryUnit infantry){
		this.dieInstantly();
	}
        
    @Override
    public void attackedBySiegeUnit(SiegeUnit siege){
    	this.dieInstantly();
	}
    
    @Override
    public void attackedByVillager(Villager villager){}


	public void dieInstantly(){
		this.receiveDamage(this.getHp());
	}

}
