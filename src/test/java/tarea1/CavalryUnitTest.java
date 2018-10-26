package tarea1;

import tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestClass to test CavalryUnit
 *
 * @author Jose Astorga
 */
public class CavalryUnitTest {
        
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
        archer.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 - 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 -10 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 - 12;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 + 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 - 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 - 5;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack( cavalry );
        double hp = cavalry.getHp();
        double expected = 100 -24;
        assertEquals(expected, hp, 0.01);

    }

   @Test
    public void attackTest(){
        double expected = 100 - 15; 
        cavalry.attack( villager );
        double hp = villager.getHp();
        assertEquals(expected, hp, 0.01);   
    }

    @Test 
    public void cantAttackWhenIsDead(){
        cavalry.receiveDamage( cavalry.getHp()); 
        cavalry.attack( villager );
        double hp = villager.getHp();
        double expected = 100;
        assertEquals(expected, hp, 0.01);      
    }

}
