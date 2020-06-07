package com.InterestCalculator;

public class NegativeNumberException extends IllegalArgumentException {
    @Override
    public String toString() {
        return "Sorry, one of the quantities entered was negative. Please try again using positive values.";
    }
}
