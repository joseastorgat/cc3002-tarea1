package tarea1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestClass to test SiegeUnit
 *
 * @author Jose Astorga
 */
public class SiegeUnitTest {
        
    private Attacker infantry;
    private Attacker cavalry;
    private Attacker archer;
    private Attacker siege;
    private Attacker monk;
    private Attacker villager;
    private Attacker castle;

    @Before
    public void setUp(){
        infantry  = new InfantryUnit(100,10);
        cavalry   = new CavalryUnit(100,10);
        archer    = new ArcherUnit(100,10);
        siege     = new SiegeUnit(100,10);
        villager  = new Villager(100,10);
        monk      = new Monk();
        castle    = new Castle();
 }
    @Test
    public void attackedByArcherTest(){
        archer.attack(siege);
        double hp = siege.getHp();
        double expected = 100 - 8;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack(siege);
        double hp = siege.getHp();
        double expected = 100 -12;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack(siege);
        double hp = siege.getHp();
        double expected = 100 -12;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack(siege);
        double hp = siege.getHp();
        double expected = 100;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack(siege);
        double hp = siege.getHp();
        double expected = 100 -15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack(siege);
        double hp = siege.getHp();
        double expected = 100 + 5;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack(siege);
        double hp = siege.getHp();
        double expected = 100 - 10;
        assertEquals(expected, hp, 0.01);

    }
}
