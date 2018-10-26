package tarea1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * TestClass to test AbstractAttacker and AbstractAttackable
 *
 * @author Jose Astorga
 */
public class GeneralTest {

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
        villager  = new Villager(5,20);
    }

    @Test
    public void receiveDamageTest(){
        double expected = infantry.getHp() - 5;
        infantry.receiveDamage(5);
        double final_hp = infantry.getHp();
        assertEquals(expected , final_hp, 0.01);
    }


    @Test
    public void healTest(){
        double expected = infantry.getHp() + 5;
        infantry.heal(5);
        double final_hp = infantry.getHp();
        assertEquals(expected , final_hp, 0.01);
    }

    @Test
    public void isAliveTest(){
        assertTrue(villager.isAlive());
        villager.receiveDamage(100);
        assertFalse(villager.isAlive());
        assertEquals(villager.getHp(), 0, 0.01);
    }

    @Test
    public void cantKeepAttackingTest(){
        villager.receiveDamage(100);
        assertFalse(villager.isAlive());

        double initial_hp =  infantry.getHp();
        villager.attack(infantry);
        double final_hp = infantry.getHp();
        assertEquals(initial_hp, final_hp, 0.01);
    }

    @Test
    public void cantHealDeadUnitsTest(){
        villager.receiveDamage(100);
        assertFalse(villager.isAlive());

        villager.heal(100);
        double hp = villager.getHp();
        assertEquals(hp, 0, 0.01);
        assertFalse(villager.isAlive());
    }

    @Test
    public void cantHealOverMaxHpTest(){

        double maxHP = villager.getMaxHp();
        double initial_hp = villager.getHp();
        assertFalse(maxHP == initial_hp);

        villager.heal(maxHP * 5);
        double hp = villager.getHp();
        assertEquals(hp, maxHP, 0.01);
    }
}
