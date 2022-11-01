package org.springframework.samples.petclinic.statistics;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepository extends CrudRepository<Achievement, Integer> {
  public List<Achievement> findAll();
}
