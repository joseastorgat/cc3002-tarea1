package tarea1;

/**
 * CavalryUnit is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class CavalryUnit extends AbstractUnit{
    public static final double INITIAL_ATTACK_POINTS = 10;
	
	public CavalryUnit(hp){
		super(hp,INITIAL_ATTACK_POINTS)
	}

	public void attackedBy(Attacker attacker){
		attacker.attackCavalryUnit(this);
    }

}