package aoc.days.day8.Instructions.conditionOperators;

public class GreaterThan implements ConditionOperator {
    @Override
    public boolean apply(int a, int b) {
        return a > b;
    }
}
