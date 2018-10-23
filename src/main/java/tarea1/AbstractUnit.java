package tarea1;


/**
 * AbstractUnit is an abstract class for objects that represents units
 * AbstractUnits are AbstracAttackers
 * @author Jose Astorga
 */

public abstract class AbstractUnit extends AbstracAttackers{
	public AbstractAttackable( hp, attackpoints){
		super(hp, 2*hp, attackpoints);
	}
}