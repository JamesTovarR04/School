package qualifications;

public interface Score {

    double MAX_SCORE = 5.0;
    double MIN_SCORE = 0.0;

    double getScore();
    void setScore(double score);

    default boolean verifyScore(double score){
        if (score < MAX_SCORE && score > MIN_SCORE)
            return true;
        else
            System.out.println(" xxx Rating value error: " + score);
        return false;
    }

}

