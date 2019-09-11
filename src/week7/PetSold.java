package week7;

public class PetSold extends ItemSold {

    private Boolean isVaccinated;
    private Boolean isNeutered;
    private Boolean isHouseBroken;

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Boolean getNeutered() {
        return isNeutered;
    }

    public void setNeutered(Boolean neutered) {
        isNeutered = neutered;
    }

    public Boolean getHouseBroken() {
        return isHouseBroken;
    }

    public void setHouseBroken(Boolean houseBroken) {
        isHouseBroken = houseBroken;
    }
}
