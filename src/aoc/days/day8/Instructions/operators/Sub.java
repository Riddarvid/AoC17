package aoc.days.day8.Instructions.operators;

public class Sub implements Operator {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
