package week4;

import java.time.*;

public class FitnessTracker {
    private String activity;
    private Integer participatingMinutes;
    private LocalDate fitnessDate;

    public FitnessTracker() {
        setActivity("running");
        setParticipatingMinutes(0);
        LocalDate now = LocalDate.now();
        setFitnessDate(LocalDate.of(now.getYear(), 01, 01));
    }

    public FitnessTracker(String activity, Integer participatingMinutes, LocalDate fitnessDate) {
        setActivity(activity);
        setParticipatingMinutes(participatingMinutes);
        setFitnessDate(fitnessDate);
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getParticipatingMinutes() {
        return participatingMinutes;
    }

    public void setParticipatingMinutes(Integer participatingMinutes) {
        this.participatingMinutes = participatingMinutes;
    }

    public LocalDate getFitnessDate() {
        return fitnessDate;
    }

    public void setFitnessDate(LocalDate fitnessDate) {
        this.fitnessDate = fitnessDate;
    }


}
