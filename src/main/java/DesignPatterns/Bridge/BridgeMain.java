package DesignPatterns.Bridge;

/**
 * instead of n*m , we create only n+m classes and connect them through bridge pattern.
 */
public class BridgeMain {
    public static void main(String[] args) {
        QRMessage qrMessage = new QRMessage(new SMS());
        qrMessage.sendMessage();
    }
}
