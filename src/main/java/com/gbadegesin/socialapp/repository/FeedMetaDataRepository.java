package com.gbadegesin.socialapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbadegesin.socialapp.jpa.FeedMetaData;

public interface FeedMetaDataRepository extends JpaRepository<FeedMetaData, Integer> {
	
}
