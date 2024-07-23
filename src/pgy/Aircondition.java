package pgy;

public class Aircondition implements ElectricDevice {

	@Override
	public void powerOnOff() {
		System.out.println(this.getClass().getName() + "의 전원이 꺼지거나 켜집니다.");


	}

}
