package org.cafe.agents;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import org.cafe.behaviour.OnePunchManAnime;
import org.cafe.behaviour.ReceiveMessageBehaviour;
import org.cafe.behaviour.SyslikBehaviour;

public class CookAgent extends Agent {
    @Override
    protected void setup() {
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType("cock-sucker-squad");
        sd.setName("JADE-cock-suck");
        dfd.addServices(sd);
        try {
            DFService.register(this, dfd);
        } catch (FIPAException fe) {
            fe.printStackTrace();
        }
        var a = new SyslikBehaviour();

        var b = new OnePunchManAnime();
        var c = new OnePunchManAnime();
    }
}
