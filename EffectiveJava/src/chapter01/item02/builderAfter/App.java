package chapter01.item02.builderAfter;

import chapter01.item02.builderBefore.TourPlan;

public class App {
	public static void main(String[] args) {
		TourDirector director = new TourDirector(new DefaultTourBuilder());
		TourPlan tourPlan1 = director.cancunTrip();
		TourPlan tourPlan2 = director.longBeachTrip();
	}
}
