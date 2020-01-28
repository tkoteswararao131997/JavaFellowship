package ProxyDesign;

import java.io.IOException;

public class CommandExecuterImplementation implements CommandExecutor 
{

	@Override
	public void runCommand(String cmd) throws IOException 
	{
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd+" executed");
	}

}
