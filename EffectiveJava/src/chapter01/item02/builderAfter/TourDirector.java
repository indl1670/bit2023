package chapter01.item02.builderAfter;

import java.time.LocalDate;

import chapter01.item02.builderBefore.TourPlan;

public class TourDirector {
	private TourPlanBuilder tourPlanBuilder;
	
	public TourDirector(TourPlanBuilder tourPlanBuilder) {
		this.tourPlanBuilder = tourPlanBuilder;
	}
	
	public TourPlan longBeachTrip() {
		return tourPlanBuilder.title("오레곤 롱비치 여행").
				startDate(LocalDate.of(2021, 7, 15))
				.getPlan();
	}
	public TourPlan cancunTrip() {
		return tourPlanBuilder.
				title("칸쿤 여행").
				nightsAndDays(2, 3).
				startDate(LocalDate.of(2020, 12, 9)).
				addPlan(0, "일정 1").
				addPlan(0, "일정 2").
				addPlan(0, "일정 3").
				addPlan(0, "일정 4").
				addPlan(0, "일정 5").
				addPlan(0, "일정 6").
				addPlan(0, "일정 7").
				addPlan(0, "일정 8").
				addPlan(0, "일정 9").
				getPlan();
	}
}
