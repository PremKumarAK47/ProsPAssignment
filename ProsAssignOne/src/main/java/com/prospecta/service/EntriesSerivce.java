package com.prospecta.service;

import java.util.List;

import com.prospecta.exceptions.InvalidEntryException;
import com.prospecta.model.Entries;


public interface EntriesSerivce {
	
	public String saveEntry(Entries entries)throws InvalidEntryException; 
	public List<Entries> getAllEntries(); 

}
