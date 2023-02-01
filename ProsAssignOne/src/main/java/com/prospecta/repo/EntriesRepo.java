package com.prospecta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecta.model.Entries;



public interface EntriesRepo extends JpaRepository<Entries, Integer> {

	public Entries findByApi(String api);
}
