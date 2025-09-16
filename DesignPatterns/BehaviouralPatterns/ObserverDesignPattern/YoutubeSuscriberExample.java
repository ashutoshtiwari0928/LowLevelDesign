package DesignPatterns.BehaviouralPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Channel{
    void suscribe(Suscriber s);
    void unsuscribe(Suscriber s);
    void notifyUsers();
}

class ConcreteChannel implements Channel{
    private final List<Suscriber> suscribers = new ArrayList<>();
    private final List<String> videos = new ArrayList<>();

    public List<String> getVideos(){
        return this.videos;
    }
    @Override
    public void suscribe(Suscriber s) {
        suscribers.add(s);
    }

    @Override
    public void unsuscribe(Suscriber s) {
        suscribers.remove(s);
    }

    @Override
    public void notifyUsers() {
        for(Suscriber s: suscribers){
            s.update(this);
        }
    }


    public void upload(String title){
        videos.add(title);
        System.out.println("Video uploaded: "+title);
        notifyUsers();
    }
}

interface Suscriber{
    void update(ConcreteChannel channel);
}

class User implements Suscriber{
    String name;
    public User(String name){
        this.name = name;
    }
    @Override
    public void update(ConcreteChannel channel) {
        System.out.println(STR."\{name} is Playing \{channel.getVideos().getLast()}");
    }
}

public class YoutubeSuscriberExample {
    public static void main(String[] args) {
        ConcreteChannel codeKarle = new ConcreteChannel();
        User u1 = new User("ram");
        User u2 = new User("gita");
        User u3 = new User("bob");

        codeKarle.suscribe(u1);
        codeKarle.suscribe(u2);
        codeKarle.suscribe(u3);

        codeKarle.upload("BST");

        codeKarle.unsuscribe(u2);
        codeKarle.upload("DP");

    }
}
