package Server;

import Models.*;
public class RunServer {
    public static void main(String[] args) {
        new Thread(new Service.RunnableListenerCLient()).start();
        new Thread(new Service.RunnableServerFile()).start();
        Service.gI().rooms.add(new Room("Phòng chat chung", -1));
    }
}
