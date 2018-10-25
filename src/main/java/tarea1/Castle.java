package tarea1;

/**
 * Castle is an AbstractAttacker
 *
 * @author Jose Astorga
 */

public class Castle extends AbstractAttacker{


	public void attackedBy(Attacker attacker){
		attacker.attackCastle(this);
    }

}
