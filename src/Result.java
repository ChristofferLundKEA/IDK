public class Result {
    String discipline;
    String competitionName;
    int resultInSeconds;

    public int resultInMinutes(){ // has to return float instead of int. fixxxxxx
        return resultInSeconds/60;
    }

    @Override
    public String toString() {
        return "\n     Discipline: " + discipline +
                "\n     Name of competition: " + competitionName +
                "\n     Result ín seconds: " + resultInSeconds + "\n";
    }
}
