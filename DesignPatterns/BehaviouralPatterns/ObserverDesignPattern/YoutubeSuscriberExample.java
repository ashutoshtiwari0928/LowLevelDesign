package DesignPatterns.BehaviouralPatterns.ObserverDesignPattern;

import java.util.List;

interface Channel{
    void suscribe();
    void unsuscribe();
    void upload(String title);
}

class ConcreteChannel implements Channel{
    List<Suscriber> suscribers;

    @Override
    public void suscribe() {

    }

    @Override
    public void unsuscribe() {

    }

    @Override
    public void upload(String title) {

    }
}

interface Suscriber{
    void update(ConcreteChannel channel);
}

public class YoutubeSuscriberExample {
}
