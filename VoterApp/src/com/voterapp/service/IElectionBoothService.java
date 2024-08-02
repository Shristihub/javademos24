package com.voterapp.service;

import com.voterapp.exceptions.InValidVoterException;

public interface IElectionBoothService {

	boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException;
}
