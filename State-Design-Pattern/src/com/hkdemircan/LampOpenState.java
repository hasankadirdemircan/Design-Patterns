package com.hkdemircan;

public class LampOpenState implements LampState {

	@Override
	public void onOpen() {
		System.out.println("Lamba açmaya çalışıyorsunuz fakat lamba zaten açık");

	}

	@Override
	public void onClose() {
		System.out.println("Lamba acik fakat kapanıyor...");
	}

}
