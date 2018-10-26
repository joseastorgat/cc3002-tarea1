package tarea1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TestClass to test ArcherUnit
 *
 * @author Jose Astorga
 */
public class ArcherUnitTest {
    
    private Attacker infantry;
    private Attacker cavalry;
    private ArcherUnit archer;
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
        archer.attack( archer );
        double hp = archer.getHp();
        double expected = 100 -12 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack( archer );
        double hp = archer.getHp();
        double expected = 100 -15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack( archer );
        double hp = archer.getHp();
        double expected = 100 -12;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack( archer );
        double hp = archer.getHp();
        double expected = 100 + 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack( archer );
        double hp = archer.getHp();
        double expected = 100 -15;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack( archer );
        double hp = archer.getHp();
        double expected = 100 - 10;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack( archer );
        double hp = archer.getHp();
        double expected = 100 - 24;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackTest(){
        double expected = 100 - 15; 
        archer.attack( villager );
        double hp = villager.getHp();
        assertEquals(expected, hp, 0.01);   
    }

    @Test 
    public void cantAttackWhenIsDead(){
        archer.receiveDamage( archer.getHp()); 
        archer.attack( villager );
        double hp = villager.getHp();
        double expected = 100;
        assertEquals(expected, hp, 0.01);      
    }
}
