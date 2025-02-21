package com.insight.practicec;

public class VoterValidator {

		 public boolean validateVoterAge(int age) throws Exception {
		        if (age < 0)
		            throw new Exception("Invalid age");
		        return age >= 18;
		    }

		
		
	}


