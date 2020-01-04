package com.tcbd07.mintproject.dao;

import com.tcbd07.mintproject.model.dto.ProgramsVo;
import com.tcbd07.mintproject.model.entity.User;

import java.util.List;

/**
 * 商家及项目展示
 */
public interface ProgramsVoDao {
    List<ProgramsVo> queryAllProgramsVo();//展示所有项目含商家
    ProgramsVo getProgramsVo(String programId);//展示单个项目
    List<User> getAllFirms(String firmId);//通过商家查询客户
}
