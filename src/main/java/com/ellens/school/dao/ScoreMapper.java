package com.ellens.school.dao;

import com.ellens.school.model.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {

    List<Score> getAllScores();

}
