package week4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FitnessTrackerTest {

    @Test
    void defaultConstructor() {
        LocalDate fitnessDate = LocalDate.of(2019, 01, 01);
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.getActivity(), "running");
        assertEquals(fitnessTracker.getParticipatingMinutes(), 0);
        assertEquals(fitnessTracker.getFitnessDate(), fitnessDate);
    }

    @Test
    void initialiser() {
        LocalDate fitnessDate = LocalDate.of(2019, 07, 07);
        FitnessTracker fitnessTracker = new FitnessTracker("cycling", 666, fitnessDate);
        assertEquals(fitnessTracker.getActivity(), "cycling");
        assertEquals(fitnessTracker.getParticipatingMinutes(), 666);
        assertEquals(fitnessTracker.getFitnessDate(), fitnessDate);
    }

}