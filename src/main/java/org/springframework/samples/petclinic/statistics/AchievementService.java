package org.springframework.samples.petclinic.statistics;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AchievementService {

  private AchievementRepository achievementRepository;

  @Autowired
  public AchievementService(AchievementRepository achievementRepository) {
    this.achievementRepository = achievementRepository;
  }

  @Transactional(readOnly=true)
  public List<Achievement> getAllAchievements() {
    return achievementRepository.findAll();
  }

  @Transactional
  public Achievement saveAchievement(Achievement achievement) {
    return this.achievementRepository.save(achievement);
  }

  @Transactional
  public void removeAchievement(Integer id) {
    this.achievementRepository.deleteById(id);
  }

  @Transactional(readOnly = true)
  public Achievement getAchievement(Integer id) {
    Optional<Achievement> achievement = this.achievementRepository.findById(id);
    return achievement.isPresent() ? achievement.get() : null;
  }
  
}
