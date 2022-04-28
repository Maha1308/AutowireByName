package com.edu;

public class Human {
	private Heart heartobj;
	

	public Heart getHeartobj() {
		return heartobj;
	}


	public void setHeartobj(Heart heartobj) {
		this.heartobj = heartobj;
	}


	public void humanFunction()
	{
		if(heartobj!=null)
		{
			heartobj.pump();
		}
		else
		{
			System.out.println("not alive");
		}
	}
	

}
