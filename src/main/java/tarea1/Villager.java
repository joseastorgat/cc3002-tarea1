package tarea1;

/**
 * Villager is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class Villager extends AbstractUnit{
    private static final double INITIAL_ATTACK_POINTS = 10;
    private static final double INITIAL_HP_POINTS = 100;

	public Villager(){
		super(INITIAL_HP_POINTS, INITIAL_ATTACK_POINTS)
	}

	public void attackedBy(Attacker attacker){
		attacker.attackVillager(this);
    }

}
