package tarea1;

/**
 * Barracks is an AbstractAttackable
 *
 * @author Jose Astorga
 */

public class Barracks extends AbstractAttackable{


	public void attackedBy(Attacker attacker){
		attacker.attackBarracks(this);
    }


}
