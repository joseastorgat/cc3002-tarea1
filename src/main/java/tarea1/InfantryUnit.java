package tarea1;

/**
 * InfantryUnit is an AbstractUnit
 *
 * @author Jose Astorga
 */

public class InfantryUnit extends AbstractUnit{
    public static final double INITIAL_ATTACK_POINTS = 10;
	
	public InfantryUnit(hp){
		super(hp,INITIAL_ATTACK_POINTS)
	}
}