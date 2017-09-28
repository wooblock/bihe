package com.inesv.digiccy.api.command;

import java.math.BigDecimal;
import java.util.Date;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class CrowdFundingDetailsCommand {

	@TargetAggregateIdentifier
    private Long id;
    /** 用户编号 */
    private Integer user_id;
    /** 众筹项目编号 */
    private String ico_id;
    /** 参与数量 */
    private Integer ico_user_number;
    /** 参与总金额 */
    private BigDecimal ico_user_sumprice;

    private Date date;
    
    private String attr1;

    private String attr2;
    
    private String operation;

	public CrowdFundingDetailsCommand(Long id, Integer user_id, String ico_id,
			Integer ico_user_number, BigDecimal ico_user_sumprice, Date date,
			String attr1, String attr2, String operation) {
		this.id = id;
		this.user_id = user_id;
		this.ico_id = ico_id;
		this.ico_user_number = ico_user_number;
		this.ico_user_sumprice = ico_user_sumprice;
		this.date = date;
		this.attr1 = attr1;
        this.attr2 = attr2;
		this.operation = operation;
	}

	public Long getId() {
		return id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public String getIco_id() {
		return ico_id;
	}

	public Integer getIco_user_number() {
		return ico_user_number;
	}

	public BigDecimal getIco_user_sumprice() {
		return ico_user_sumprice;
	}

	public Date getDate() {
		return date;
	}
	
	public String getAttr1() {
		return attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public String getOperation() {
		return operation;
	}
}
