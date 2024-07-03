package com.llf.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfoPo {
	
	private String orderId;
	private String userId;
	private String commodityId;
	private String commodityName;
	private String merchantId;
	private String merchantName;
	private String number;
	private String status;
	private String price;
	private String deleteFlag;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;

}
