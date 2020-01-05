package bgu.spl.net.impl.stomp;

import bgu.spl.net.api.StompMessagingProtocol;
import bgu.spl.net.srv.Connections;

public class StompMessagingProtocolImpl implements StompMessagingProtocol {
    //fields
    private int connectionId;
    private Connections<String> connections;
    /**
     * Used to initiate the current client protocol with it's personal connection ID and the connections implementation
     **/
    @Override
    public void start(int connectionId, Connections<String> connections){
        this.connectionId = connectionId;
        this.connections = connections;
    }
    @Override
    public String process(String message){
        return null;
    }

    /**
     * @return true if the connection should be terminated
     */
    @Override
    public boolean shouldTerminate(){
        return true;
    }
}
