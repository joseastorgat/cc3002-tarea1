package tarea1;

import tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * TestClass to test Barracks
 *
 * @author Jose Astorga
 */
public class BarracksTest {
    
    private Attacker infantry;
    private Attacker cavalry;
    private Attacker archer;
    private Attacker siege;
    private Attacker monk;
    private Attacker villager;
    private Attacker castle;
    private Entity barrack;

    @Before
    public void setUp(){
        infantry  = new InfantryUnit(100,10);
        cavalry   = new CavalryUnit(100,10);
        archer    = new ArcherUnit(100,10);
        siege     = new SiegeUnit(100,10);
        villager  = new Villager(100,10);
        monk      = new Monk();
        castle    = new Castle();
        barrack   = new Barracks();
    }
    @Test
    public void attackedByArcherTest(){
        archer.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 - 7;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 - 7;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 -7;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 - 20;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        this.attackedBySiegeTest();
        villager.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 - 20 + 7;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack( barrack );
        double hp = barrack.getHp();
        double expected = 500 - 14;
        assertEquals(expected, hp, 0.01);

    }
}
