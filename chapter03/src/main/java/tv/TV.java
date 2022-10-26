package tv;

public class TV {
	private int channel; // 1 ~ 255 사이 값을 가지게 하고 넘어갈 때는 라운딩 시킬 것
	private int volume; // 0 ~ 100 사이 값을 가지게 하고 넘어갈 때는 라운딩 시킬 것
	private boolean power;

	public TV() {

	}

	public TV(int c, int v, boolean p) {
		this.channel = c;
		this.volume = v;
		this.power = p;
	}

	public void status() {
		System.out
				.println("TV[channel= " + channel + ", volume= " + volume + ", power= " + (power ? "On" : "Off") + "]");
	}

	public void channel(int c) {
		
		int[] result = new int[255];
		for (int i = 1; i < result.length; i++) {
			if (result[i] > 255) {
				result[i] = result[i] - 255;
			} else if (result[i] < 1) {
				result[i] = result[i] + 255;
			}
			c = result[i];
		}
		this.channel = c;
	}

	public void volume(int v) {

		int[] result = new int[101];
		for (int i = 0; i < result.length; i++) {
			v = result[i];
			if (result[i] > 100) {
				result[i] = result[i] - 101;
			} else if (result[i] < 0) {
				result[i] = result[i] + 101;
			}
			v = result[i];
		}
		this.volume = v;
	}

	public void power(boolean p) {
		this.power = p;
	}

}
