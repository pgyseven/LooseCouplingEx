package pgy;

public class RemoteController implements Remoteable {

	@Override
	public void remoteControl(ElectricDevice ed) {
		System.out.println(ed.getClass().getName() + "을 제어합니다.");
		ed.powerOnOff();
	}

}
