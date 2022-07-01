package visitor;

public class PerformanceRating {

    private int id;

    private int personalRating;

    private int teamAverageRating;

    private int finalRating;

    public PerformanceRating(int id, int personalRating) {
        this.id = id;
        this.personalRating = personalRating;
    }

    public int getId() {
        return id;
    }

    public int getPersonalRating() {
        return personalRating;
    }

    public int getTeamAverageRating() {
        return teamAverageRating;
    }

    public int getFinalRating() {
        return finalRating;
    }

    public void setTeamAverageRating(int teamAverageRating) {
        this.teamAverageRating = teamAverageRating;
    }

    public void setFinalRating(int finalRating) {
        this.finalRating = finalRating;
    }


}
