package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestTestNG {

    @Test
    public void amountBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void amountHigherBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2679;

        int actual = cashbackHackService.remain(amount);
        int expected = 321;

        assertEquals(actual, expected);
    }
    @Test
    public void amountEqualToBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
