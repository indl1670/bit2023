package chapter01.item02.builderAfter;

import java.time.LocalDate;

import chapter01.item02.builderBefore.TourPlan;

public interface TourPlanBuilder {
	TourPlanBuilder nightsAndDays(int nights, int days);
	TourPlanBuilder title(String title);
	TourPlanBuilder startDate(LocalDate localDate);
	TourPlanBuilder whereToStay(String whereToStay);
	TourPlanBuilder addPlan(int day, String plan);
	
	TourPlan getPlan();
	
}
