package tarea1;

import tarea1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CastleTest {

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
        archer.attack( castle );
        double hp = castle.getHp();
        double expected = 1000 - 1 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByCavalryTest(){
        cavalry.attack( castle );
        double hp = castle.getHp();
        double expected = 1000 - 3;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByInfantryTest(){    
        infantry.attack( castle );
        double hp = castle.getHp();
        double expected = 1000 - 3 ;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByMonkTest(){
        monk.attack( castle );
        double hp = castle.getHp();
        double expected = 1000;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedBySiegeTest(){
        siege.attack( castle );
        double hp = castle.getHp();
        double expected = 1000 - 20;
        assertEquals(expected, hp, 0.01);
    }

    @Test
    public void attackedByVillagerTest(){

        this.attackedBySiegeTest();
        villager.attack( castle );
        double hp = castle.getHp();
        double expected = 980 + 3 ;

        assertEquals(expected, hp, 0.01);

    }
   
    @Test
    public void attackedByCastleTest(){
        castle.attack( castle );
        double hp = castle.getHp();
        double expected = 1000 - 2 ;
        assertEquals(expected, hp, 0.01);

    }
}
