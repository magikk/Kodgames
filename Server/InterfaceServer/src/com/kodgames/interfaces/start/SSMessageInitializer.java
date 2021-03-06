package com.kodgames.interfaces.start;

import java.util.List;

import com.kodgames.corgi.core.net.ServerMessageInitializer;
import com.kodgames.interfaces.net.connection.SSConnectionHandler;

/**
 * Interface-Manager连接
 */
public class SSMessageInitializer extends ServerMessageInitializer
{
	@SuppressWarnings("rawtypes")
	public SSMessageInitializer(List<String> actionPackageList, List<Class> protocolClassList)
	{
		super(actionPackageList, protocolClassList);
	}

	@Override
    protected void initMessages() throws Exception
    {
		super.initMessages();
	    SSConnectionHandler connectionHandler = new SSConnectionHandler();
	    setConnectionHandler(connectionHandler);
    }
}
