package tarea1;

import tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MonkTest {
        
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
        archer.attack(monk);
        double hp = monk.getHp();
        double expected = 0 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack(monk);
        double hp = monk.getHp();
        double expected = 0;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack(monk);
        double hp = monk.getHp();
        double expected = 0;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack(monk);
        double hp = monk.getHp();
        double expected = 9000 + 10;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack(monk);
        double hp = monk.getHp();
        double expected = 0;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){
        villager.attack(monk);
        double hp = monk.getHp();
        double expected = 9000;
        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack(monk);
        double hp = monk.getHp();
        double expected = 0;
        assertEquals(expected, hp, 0.01);

    }
}
