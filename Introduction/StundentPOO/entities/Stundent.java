package Introduction.StundentPOO.entities;

public class Stundent {
    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;
    public double miss;

    public double finalGrade(){
        return gradeOne + gradeTwo + gradeThree;
    }

    public double missingPoints() {
      if (finalGrade() < 60) {
        return miss = 60 - this.finalGrade(); 
      }
        return 0;
    }

}


