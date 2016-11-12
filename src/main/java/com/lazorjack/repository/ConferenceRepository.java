package com.lazorjack.repository;

import com.lazorjack.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jacklazorchak on 11/6/16.
 */
public interface ConferenceRepository extends JpaRepository<Conference, Long> {

    Conference findByAbbreviation(String abbreviation);

}
