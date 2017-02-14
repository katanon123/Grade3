/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.th.npru.grade3;





/**
 *
 * @author katanon2
 */
public class Gread implements IGread{
           String Grade;
            int Test_score ;
        public String Test_score() {      
        if (Test_score >= 80) {
            Grade = "A";
        } else if (Test_score >= 79) {
            Grade = "B+";
             } else if (Test_score >= 74) {
            Grade = "B";
        } else if (Test_score >= 70) {
            Grade = "C+";
             } else if (Test_score >= 64) {
            Grade = "C";
        } else if (Test_score >= 60) {
            Grade = "D+";
        } else if (Tests_core >= 54) {
            Grade = "D";
        } else {
            Grade = "I";
        }

    return Grade;    
}
}


   
    

  
    

