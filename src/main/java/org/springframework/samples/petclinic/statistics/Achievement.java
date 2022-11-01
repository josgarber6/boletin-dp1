package org.springframework.samples.petclinic.statistics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="achievements")
public class Achievement extends NamedEntity {

  @NotBlank
  @Column(name = "description")
  private String description;
  @Column(name = "badge_image")
  private String badgeImage;
  @Column(name = "threshold")
  private double threshold;
  
  public String getActualDescription() {
    return description.replace("<THRESHOLD>", String.valueOf(threshold));
  }

}
