package tarea1;

/**
 * SiegeUnit is an AbstractUnit
 *
 * @author Jose Astorga
 */


public class SiegeUnit extends AbstractUnit{
    public static final double INITIAL_ATTACK_POINTS = 10;
	
	public SiegeUnit(hp){
		super(hp,INITIAL_ATTACK_POINTS)
	}
}
