package org.cafe.agents;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

import java.util.concurrent.TimeUnit;

public class SessionAgent extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, 10) {
            @Override
            protected void onTick() {
                System.out.println(this.getTickCount());
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
