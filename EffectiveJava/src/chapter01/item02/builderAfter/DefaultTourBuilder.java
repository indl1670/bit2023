package chapter01.item02.builderAfter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import chapter01.item02.builderBefore.DetailPlan;
import chapter01.item02.builderBefore.TourPlan;

public class DefaultTourBuilder implements TourPlanBuilder {
	private String title;
	private int nights;
	private int days;
	private LocalDate startDate;
	private String whereToStay;
	private List<DetailPlan> plans;

	@Override
	public TourPlanBuilder nightsAndDays(int nights, int days) {
		this.nights = nights;
		this.days = days;
		return this;
	}

	@Override
	public TourPlanBuilder title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public TourPlanBuilder startDate(LocalDate localDate) {
		this.startDate = localDate;
		return this;
	}

	@Override
	public TourPlanBuilder whereToStay(String whereToStay) {
		this.whereToStay = whereToStay;
		return this;
	}

	@Override
	public TourPlanBuilder addPlan(int day, String plan) {
		if (this.plans == null) {
			this.plans = new ArrayList<>();
		}
		this.plans.add(new DetailPlan(day, plan));
		return this;
	}

	@Override
	public TourPlan getPlan() {
		// TODO Auto-generated method stub
		return new TourPlan(title, nights, days, startDate, whereToStay, plans);
	}

}
