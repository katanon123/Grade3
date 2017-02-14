/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade3;





/**
 *
 * @author katanon2
 */
public class Gread implements IGread{
           String grade;
            int testscore ;
        public String testscore() {      
        if (testscore >= 80) {
            grade = "A";
        } else if (testscore >= 79) {
            grade = "B+";
             } else if (testscore >= 74) {
            grade = "B";
        } else if (testscore >= 70) {
            grade = "C+";
             } else if (testscore >= 64) {
            grade = "C";
        } else if (testscore >= 60) {
            grade = "D+";
        } else if (testscore >= 54) {
            grade = "D";
        } else {
            grade = "I";
        }

    return grade;    
}
}


   
    

  
    

