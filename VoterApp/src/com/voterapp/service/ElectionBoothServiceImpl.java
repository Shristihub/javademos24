package com.voterapp.service;

import com.voterapp.exceptions.InValidVoterException;
import com.voterapp.exceptions.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService{

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean checkAge(int age)throws UnderAgeException{
		
	}
	private boolean checkLocality(String locality)throws LocalityNotFoundException{ 
		
	}
	private boolean checkVoterId(int voterId) throws NoVoterIDException {
		
	}

}
