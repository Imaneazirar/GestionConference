package com.mql.metier;

import java.util.List;

import com.mql.entities.Chair;

public interface IChairMetier {
  public List<Chair> findAllChair();
  public void saveChair();
  public Chair findOne(long id);
}
