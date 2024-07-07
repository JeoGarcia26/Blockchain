package com.ucan.blockchain.models;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

@Getter
@Setter
public class Peer {
    private DatagramSocket socket;
    private int port;

    public Peer(int port) {
        this.port = port;
        try {
            this.socket = new DatagramSocket(this.port);
            this.socket.setBroadcast(true);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void sendBroadcastMessage(String message) {
        byte[] buffer = message.getBytes();
        InetAddress broadcastAddress = null;
        try {
            broadcastAddress = InetAddress.getByName("255.255.255.255");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, broadcastAddress, this.port);
            this.socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void receiveMessage() {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        try {
            this.socket.receive(packet);
            String receivedMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + receivedMessage + " from " + packet.getAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
