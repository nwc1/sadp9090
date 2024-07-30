public class RemoteLoader 
{
	public static void main(String[] args) 
	{
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanLowCommand ceilingFanLow =new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium =new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh =new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff =new CeilingFanOffCommand(ceilingFan);
		remoteControl.setCommand(1, ceilingFanLow, ceilingFanOff);
		remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
		

		remoteControl.offButtonWasPushed(1);//Set to off
		remoteControl.onButtonWasPushed(1);//Set to low
		remoteControl.undoButtonWasPushed(); System.out.println("===============================================");

		remoteControl.onButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.undoButtonWasPushed(); System.out.println("===============================================");
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed(); System.out.println("===============================================");

		remoteControl.onButtonWasPushed(3);
		remoteControl.onButtonWasPushed(2);
		remoteControl.undoButtonWasPushed(); System.out.println("===============================================");

		remoteControl.onButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.undoButtonWasPushed(); System.out.println("===============================================");
		//System.out.println(remoteControl);
	}
}
