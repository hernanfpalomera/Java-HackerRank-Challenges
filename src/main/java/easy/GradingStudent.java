package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudent {


    public static void main(String[] args) {

        List<Integer> studentGrades = new ArrayList<>(Arrays.asList(73,67,38, 33));

        System.out.println(gradingStudents(studentGrades));
    }


     static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> gradesResults = new ArrayList<>();
        for (Integer grade : grades) {

            if(grade < 38 ){
                gradesResults.add(grade);
            }else{
                Integer roundedGrade = (grade + 4) / 5 * 5;
                if(roundedGrade - grade < 3)
                    gradesResults.add(roundedGrade);
                else
                    gradesResults.add(grade);
            }
        }

        return gradesResults;
    }
}

