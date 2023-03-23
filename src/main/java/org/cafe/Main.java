package org.cafe;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.wrapper.StaleProxyException;
import org.cafe.agents.CookAgent;
import org.cafe.agents.SessionAgent;

import java.util.logging.*;

public class Main extends Agent {
    public DFAgentDescription[] hui() throws FIPAException {
        DFAgentDescription template = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType("cock-sucker-squad");
        template.addServices(sd);
        DFAgentDescription[] result = DFService.search(this, template);
        return result;
    }
    public static void main(String[] args) throws StaleProxyException, FIPAException {
        MainController mainController = new MainController();
        var a = mainController.createAgent(SessionAgent.class, "Cock sucker tasty cock");
        a.start();
    }
}