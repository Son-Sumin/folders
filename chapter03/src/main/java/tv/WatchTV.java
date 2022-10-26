package tv;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(120);  // -1는 100, 101는 0
		tv.status();

		tv.volume(false);  // 아날로그 방식, 아래는 false / -1는 100
		tv.status();

		tv.channel(0);
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();

	}

}
