package com.example.binhdv35.lab7_ex2;

import java.io.IOException;
import java.net.ServerSocket;

public class Server extends Thread{

    int count = 0;

    @Override
    public void run() {
        super.run();
        try {
// create ServerSocket using specified port
            serverSocket = new ServerSocket(socketServerPORT);
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    activity.info.setText("I'm waiting here:

                            " + serverSocket.getLocalPort());
                }
            });
            while (true) {
// block the call until connection is created

                and return

// Socket object
                        Socket socket = serverSocket.accept();
                count++;
                message += "#" + count + " from " +

                        socket.getInetAddress() + ":" + socket.getPort() + "\n";

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        activity.msg.setText(message);
                    }
                });
                SocketServerReplyThread

                        socketServerReplyThread = new SocketServerReplyThread(socket, count);

                socketServerReplyThread.run();
            }
        } catch (IOException e) {}
    }
}
