package ProxyDesign;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor 
{
	private boolean isAdmin;
	private CommandExecutor executer;
	@Override
	public void runCommand(String cmd) throws Exception 
	{
		if(isAdmin==true)
		{
			executer.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executer.runCommand(cmd);
			}
		}
	}
	public CommandExecutorProxy(String user,String pwd)
	{
		if("koti".equals(user) && "123".equals(pwd))
		{
			isAdmin=true;
		}
		executer=new CommandExecuterImplementation();
	}
	
}
