public class Student {
    private String name;
    private String ic;
    private String address;
    private int year;
    private String schoolName;
    private int[] scores;

    public Student(String name, String ic, String address, int year, String schoolName, int[] scores) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int[] getScores() {
        return scores;
    }

    public double getAverageScore() {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return (double) totalScore / scores.length;
    }

    public int getMinScore() {
        int minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }
        return minScore;
    }

    public int getMaxScore() {
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }
}
