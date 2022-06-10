package DesignPatterns.publisher_subscriber.model;

public class Publisher {
    Topic topic;
    public Publisher(Topic t) {
        this.topic = t;
    }

    public void publish(Message m) {
        ContentServer.getInstance().sendMessage(this.topic, m);
    }
}
