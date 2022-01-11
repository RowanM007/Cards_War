package com.kotlin.main

val CardValues = mapOf(
    '2' to 1,
    '3' to 2,
    '4' to 3,
    '5' to 4,
    '6' to 5,
    '7' to 6,
    '8' to 7,
    '9' to 8,
    'T' to 9,
    'J' to 10,
    'Q' to 11,
    'K' to 12,
    'A' to 13
)

fun compareTwoCards(Alex_Card: Char, Bob_card: Char): Int =
    if (CardValues.getValue(Alex_Card) > CardValues.getValue(Bob_card)) 1 else 0


fun compareTwoDecks(Alex_deck: String, Bob_deck: String): Int {
    var alexScore = 0
    for (index in Alex_deck.indices) {
        alexScore += compareTwoCards(Alex_deck[index], Bob_deck[index])
    }
    return alexScore
}

