package DesignPatterns.publisher_subscriber.model;

/**
 * implements as a separate thread
 */
public class Subscriber {
    public Subscriber(Topic...topics) {
        for (Topic t : topics) {
            ContentServer.getInstance().registerSubscriber(this, t);
        }
    }

    public void receivedMessage(Topic t, Message m) {
        switch(t) {
            case default: System.out.println("Received message: " + m.getMessage());
        }
    }
}