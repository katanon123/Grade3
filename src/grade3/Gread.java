/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.npru.se.grade;

public class EnglishSubject implements Computable {

	String grade;
	final String GRADE_A = "A";
	final String GRADE_B_PLUS = "B+";
	final String GRADE_B = "B";
	final String GRADE_C_PLUS = "C+";
	final String GRADE_C = "C";
	final String GRADE_D_PLUS = "D+";
	final String GRADE_D = "D";
	final String GRADE_E = "E";
	@Override
	public String computeGrade(float point) {
		// TODO Auto-generated method stub
		if(point >= 80){
			grade = GRADE_A; 
		}else if(point >=75){
			grade = GRADE_B_PLUS;
		}else if(point >= 70){
			grade = GRADE_B;
		}else if(point >= 65){
			grade = GRADE_C_PLUS;
		}else if(point >= 60){
			grade = GRADE_C;
		}else if(point >= 55){
			grade = GRADE_D_PLUS;
		}else if(point >= 50){
			grade = GRADE_D;
		}else{
			grade = GRADE_E;
		}
		
		return grade;
	}

}
