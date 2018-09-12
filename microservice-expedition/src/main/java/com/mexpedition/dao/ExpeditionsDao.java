package com.mexpedition.dao;

import com.mexpedition.model.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpeditionsDao extends JpaRepository<Expedition,Integer> {


}
