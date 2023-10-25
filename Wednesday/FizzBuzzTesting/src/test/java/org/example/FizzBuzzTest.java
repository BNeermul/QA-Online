package org.example;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    @DisplayName("return Fizz")
    void fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("return Buzz")
    void buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("return FizzBuzz")
    void fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("return non-FizzBuzz integer")
    void notFizzBuzz() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

}