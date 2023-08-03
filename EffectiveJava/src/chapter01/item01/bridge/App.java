package chapter01.item01.bridge;

public abstract class App implements Champion {

	public static void main(String[] args) {
		Champion kda아리 = new 아리(new KDA());
		kda아리.skillQ();
		kda아리.skillW();
		
		Champion poolParty아리 = new 아리(new PoolParty());
		poolParty아리.skillR();
		poolParty아리.skillW();
	}

}
