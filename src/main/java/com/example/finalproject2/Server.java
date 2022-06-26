package com.example.finalproject2;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public Server(ServerSocket serverSocket){
       try {
           this.serverSocket =serverSocket;
           this.socket =serverSocket.accept();
           this.bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
           this.bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

       }catch (IOException e){
           System.out.println("error creating server");
           e.printStackTrace();
       }
    }

    public void sendMassageToClient(String massageToClient){
        try{
            bufferedWriter.write(massageToClient);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("error sending massage to client");
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void receiveMassageFromClient(VBox vBox){
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(socket.isConnected()){
                    try {
                        String massageFromClient = bufferedReader.readLine();
                        ServerController.addLabel(massageFromClient, vBox);

                    }catch (IOException e){
                        e.printStackTrace();
                        System.out.println("error receiving massage from client");
                        closeEverything(socket,bufferedReader,bufferedWriter);
                        break;
                    }

                }
            }
        }).start();
    }

    public void closeEverything(Socket socket,BufferedReader bufferedReader,BufferedWriter bufferedWriter){
        try{
        if (bufferedReader != null){
            bufferedReader.close();
        }
        if (bufferedWriter != null){
            bufferedWriter.close();
        }
        if (socket != null){
            socket.close();
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
