package com.lazorjack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lazorjack.football.entity.Conference;

/**
 * Created by jacklazorchak on 11/6/16.
 */
public interface ConferenceRepository extends JpaRepository<Conference, Long> {

    Conference findByAbbreviation(String abbreviation);

}
