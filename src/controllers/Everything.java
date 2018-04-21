package controllers;

import com.mycompany.soapserv.RsiClient;

import java.util.List;

public class Everything {

    static RsiClient rsiClient;

    public static void setClient(List<RsiClient> clients, String username){
        rsiClient=clients.stream().filter(client -> client.getUsername().contentEquals(username)).findFirst().get();
    }
}
