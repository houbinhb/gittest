package com.houb.service;

import com.houb.mapper.JobLevelMapper;
import com.houb.model.JobLevel;
import com.houb.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobLevelService {

    @Autowired
    JobLevelMapper jobLevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }

    public Integer addPosition(JobLevel jobLevel) {
        jobLevel.setEnabled(true);
        jobLevel.setCreateDate(new Date());
        return jobLevelMapper.insertSelective(jobLevel);
    }

    public Integer updatePosition(JobLevel jobLevel) {
        //position.setEnabled(true);
        jobLevel.setCreateDate(new Date());
        return jobLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public Integer deletePosition(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deletePositionsByIds(Integer[] ids) {
        return jobLevelMapper.deletePositionsByIds(ids);
    }
}
