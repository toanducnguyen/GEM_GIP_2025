package demo.Tut1;

public class Student {
     private String name;
     private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String checkPassFail(int score){
        if (score > 70 ){
            return "pass";
        } else {
            return "fall";
        }
    };
}





