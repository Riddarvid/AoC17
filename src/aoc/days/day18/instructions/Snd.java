package aoc.days.day18.instructions;

import aoc.days.day18.VM;

public class Snd extends Instruction{
    private String frequency;

    public Snd(String x) {
        frequency = x;
    }

    @Override
    public void execute(VM vm) {
        long sound = valueOf(frequency, vm);
        synchronized (vm) {
            vm.sendMessage(sound);
        }
    }
}
