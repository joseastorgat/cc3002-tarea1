package tarea1;

/**
 * ArcherUnit is an AbstractAttacker
 *
 * @author Jose Astorga
 */

public class ArcherUnit extends AbstractUnit{
	
	public ArcherUnit(hp){
		super(hp,INITIAL_ATTACK_POINTS);
        this.set_infantry_factor()
        this.set_infantry_factor(13)
        this.set_infantry_factor(15)
        this.set_infantry_factor(61)
        this.set_infantry_factor(15)
           
	}
    
    public void attackedBy(Attacker attacker){
        attacker.attackArcherUnit(this);
    }

	

    // @Override
    // public void attackInfantryUnit(InfantryUnit infantry);
    // @Override
    // public void attackCavalryUnit(CavalryUnit cavalry);
    // @Override
    // public void attackSiegeUnit(SiegeUnit siege);
    // @Override
    // public void attackArcherUnit(ArcherUnit archer);
    // @Override
    // public void attackVillager(Villager villager);
    // @Override
    // public void attackMonk(Monk monk);
    // @Override
    // public void attackCastle(Castle castle);
    // @Override
    // public void attackBarrack(Barrack barrack);

}
