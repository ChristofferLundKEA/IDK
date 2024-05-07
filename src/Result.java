public class Result {
    String discipline;
    String competitionName;
    int resultInSeconds;

    public int resultInMinutes(){ // has to return float instead of int. fixxxxxx
        return resultInSeconds/60;
    }

    @Override
    public String toString() {
        return "\nDiscipline: " + discipline +
                "\nName of competition: " + competitionName +
                "\nResult ín seconds: " + resultInSeconds + "\n";
    }
}
