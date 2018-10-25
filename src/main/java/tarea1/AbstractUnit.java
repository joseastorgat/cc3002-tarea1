package tarea1;


/**
 * AbstractUnit is an abstract class for objects that represents units
 * AbstractUnits are AbstracAttackers
 * @author Jose Astorga
 */

public abstract class AbstractUnit extends AbstractAttacker{

	/**
	 *  AbstracUnit Constructor.
	 *  AbstractUnit maxHp doubles initial hp.
	 *  @param hp  Initial HitPoints of the object.
	 * 	@param attackpoints  AttackPoints of the object.
	 *
	 */
	public AbstractUnit( double hp, double attackpoints){
		super(hp, 2*hp, attackpoints);
	}
}