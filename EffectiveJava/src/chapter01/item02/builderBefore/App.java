package chapter01.item02.builderBefore;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		TourPlan shortTrip = new TourPlan();
		shortTrip.setTitle("오레곤 롱비치 여행");
		shortTrip.setStartDate(LocalDate.of(2021, 7, 15));
		
		TourPlan tourPlan = new TourPlan();
		tourPlan.setTitle("칸쿤 여행");
		tourPlan.setNights(2);
		tourPlan.setDays(3);
		tourPlan.setStartDate(LocalDate.of(2020, 23, 9));
		tourPlan.addPlan(0, "일정 1");
		tourPlan.addPlan(0, "일정 2");
		tourPlan.addPlan(1, "일정 3");
		tourPlan.addPlan(1, "일정 4");
		tourPlan.addPlan(1, "일정 5");
		tourPlan.addPlan(1, "일정 6");
		tourPlan.addPlan(1, "일정 7");
		tourPlan.addPlan(0, "일정 8");
		tourPlan.addPlan(0, "일정 9");
	}
}
