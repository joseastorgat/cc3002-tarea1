package tarea1;

/**
 * AbstractAttacker is an abstract class for objects that attacks
 *
 * @author Jose Astorga
 */

public abstract class AbstractAttacker extends AbstractAttackable implements Attacker{
	private double attackpoints;
	private double infantry_factor;

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
		if(this.isAlive()){ entity.attackedBy(this); }
	}


	@Override
	public attackMonk(Monk monk){
		monk.receiveDamage(monk.getHp());

	}


    /**
     * method to attack an InfantryUnit
     *
     * @param infantry Infantry unit to be attacked
     */    
    @Override
    public void attackInfantryUnit(InfantryUnit infantry);{
    	this.infantry_factor*this.hp()
    }

    
    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */
    @Override
    public void attackCavalryUnit(CavalryUnit cavalry);

    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */

    @Override
    public void attackSiegeUnit(SiegeUnit siege);

    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */

    @Override
    public void attackArcherUnit(ArcherUnit archer);


    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */   
    @Override
    public void attackVillager(Villager villager);

    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */
    @Override
    public void attackMonk(Monk monk);

    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */
    @Override
    public void attackCastle(Castle castle);

    /**
     * method to attack an Cavalry Unit
     *
     * @param infantry Cavalry unit to be attacked
     */
    @Override
    public void attackBarrack(Barrack barrack);

}

	// @Override
	// public attackMonk(Monk monk){
	// 	monk.receiveDamage(monk.getHp());

	// }

 //    @Override
 //    public void attackInfantryUnit(InfantryUnit infantry);{
 //    	this.infantry_factor*this.hp()
 //    }

    
 //    @Override
 //    public void attackCavalryUnit(CavalryUnit cavalry);

    
 //    @Override
 //    public void attackSiegeUnit(SiegeUnit siege);

    
 //    @Override
 //    public void attackArcherUnit(ArcherUnit archer);

    
 //    @Override
 //    public void attackVillager(Villager villager);

 //    @Override
 //    public void attackMonk(Monk monk);

 //    @Override
 //    public void attackCastle(Castle castle);

 //    @Override
 //    public void attackBarrack(Barrack barrack);
