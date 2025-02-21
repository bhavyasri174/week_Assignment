package com.insight.practicec;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {
    
	 
    VoterValidator voterValidator = new VoterValidator();
    

    @Test
    public void testValidateVoterAgeInvalid() {
    	
        Exception exception = assertThrows(Exception.class, () -> {voterValidator.validateVoterAge(-1);});
        assertEquals("Invalid age", exception.getMessage());
        
    }
    
    @ParameterizedTest
    @ValueSource(ints = { 18, 20, 45, 78 })
    public void validateVoterAgeTestValid(int age) throws Exception {
        assertTrue(voterValidator.validateVoterAge(age));
    }
}

