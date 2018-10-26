package tarea1;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * TestClass to test Villager
 *
 * @author Jose Astorga
 */
public class VillagerTest{
    
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
        archer.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack( villager );
        double hp = villager.getHp();
        double expected = 100 + 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 10;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack( villager );
        double hp = villager.getHp();
        double expected = 100 - 24 ;
        assertEquals(expected, hp, 0.01);
    }


   @Test
    public void attackTest(){
        double expected = 100 - 8; 
        villager.attack( infantry );
        double hp = infantry.getHp();
        assertEquals(expected, hp, 0.01);   
    }

    @Test 
    public void cantAttackWhenIsDead(){
        villager.receiveDamage( villager.getHp()); 
        villager.attack( infantry );
        double hp = infantry.getHp();
        double expected = 100;
        assertEquals(expected, hp, 0.01);      
    }

}
