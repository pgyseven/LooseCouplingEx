package pgy;

public class Test {

	public static void main(String[] args) {
//		new Tv().powerOnOff();
//		new Aircondition().powerOnOff(); //인터페이스로 인해 규칙이 생김 전자 디바이스는 전원이 켜짐의 기능이 있어야한다는 규칙이 생긴거임 즉 다른 사람들이 만들때 인터페이스를 보고 만드니깐 규칙에 의해 만들어짐

		Tv 티비 = new Tv();
		Aircondition 에어컨 = new Aircondition();
		
		RemoteController 리모컨 = new RemoteController();
		리모컨.remoteControl(티비); //업케스팅되어 넘어감
		리모컨.remoteControl(에어컨);
	}

}
