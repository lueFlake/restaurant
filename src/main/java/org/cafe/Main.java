package org.cafe;

import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.initAgents("org.cafe.agents");
    }
}