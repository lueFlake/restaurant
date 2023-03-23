package org.cafe.behaviour;

import jade.core.behaviours.CyclicBehaviour;

import java.util.concurrent.TimeUnit;

public class SyslikBehaviour extends CyclicBehaviour {
    @Override
    public void action() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cock sucker");
    }
}
