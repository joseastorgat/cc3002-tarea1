package tarea1;

/**
 * Monk is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class Monk extends AbstractUnit{
    public static final double INITIAL_ATTACK_POINTS = 10;
	
	public Monk(hp){
		super(hp,INITIAL_ATTACK_POINTS)
	}


	public void attackedBy(Attacker attacker){
		attacker.attackMonk(this);
    }

}
