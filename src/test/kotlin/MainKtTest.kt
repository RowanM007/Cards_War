package com.kotlin.main

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals



class MainKtTest {
    @Test
    fun shouldCompareTwoCards(){
        assertEquals(1, compareTwoCards('J', '7'))
        assertEquals(0, compareTwoCards('5','5'))
        assertEquals(0, compareTwoCards('2', '4'))
    }

    @Test
    fun shouldCompareTwoDecks(){
        assertEquals(4, compareTwoDecks("A586QK", "JJ653K"))
        assertEquals(4, compareTwoDecks("23A84Q", "K2Q25J"))
        assertEquals(0, compareTwoDecks("234567", "345678"))
        assertEquals(1, compareTwoDecks("AKQJT9", "KAAAAA"))
    }
}