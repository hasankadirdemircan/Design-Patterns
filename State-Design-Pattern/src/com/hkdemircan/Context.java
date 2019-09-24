package com.hkdemircan;

public class Context {
	private LampState lampState;

	public Context() {
		setLampState(new LampClosedState());
	}

	public void onOpen() {
		lampState.onOpen();
		if (lampState instanceof LampClosedState) {
			setLampState(new LampOpenState());
			System.out.println("Lambanın içsel durumu şu oldu : " + lampState.getClass().getName());
		}
	}

	public void onClose() {
		lampState.onClose();
		if (lampState instanceof LampOpenState) {
			setLampState(new LampOpenState());
			System.out.println("Lambanın içsel durumu şu oldu : " + lampState.getClass().getName());
		}
	}

	public LampState getLampState() {
		return lampState;
	}

	public void setLampState(LampState lampState) {
		this.lampState = lampState;
	}

}
