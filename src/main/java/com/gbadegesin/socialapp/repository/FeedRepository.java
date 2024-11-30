package com.gbadegesin.socialapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gbadegesin.socialapp.jpa.Feed;
import com.gbadegesin.socialapp.jpa.User;

public interface FeedRepository extends JpaRepository<Feed, Integer> {

	Page<Feed> findByUser(User user, Pageable pageable);
	Page<Feed> findByUserNot(User user, Pageable pageable);
}
