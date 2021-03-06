package com.inesv.digiccy.persistence.finance;

import com.inesv.digiccy.dto.PoundageDto;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Created by yc on 2017/1/5 0005.
 */
@Component
public class PoundagePersistence {


    @Autowired
    QueryRunner queryRunner;

    /**
     *新增手续费记录
     */
    @Transactional
    public void insertPoundageInfo(PoundageDto dto){
        String insertBuyPoundage = "INSERT INTO t_inesv_poundage(user_no,optype,type,money,date) VALUES(?,?,?,?,?)";
        Object parmas[] = {dto.getUser_no(),dto.getOptype(),dto.getType(),dto.getMoney(),dto.getDate()};
        try {
            queryRunner.update(insertBuyPoundage,parmas);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
