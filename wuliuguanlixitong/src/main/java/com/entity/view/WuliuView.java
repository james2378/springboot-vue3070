package com.entity.view;

import com.entity.WuliuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 物流信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wuliu")
public class WuliuView extends WuliuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 物流状态的值
		*/
		private String wuliuValue;



		//级联表 cheliang
			/**
			* 车辆编号
			*/
			private String cheliangUuidNumber;
			/**
			* 车辆名称
			*/
			private String cheliangName;
			/**
			* 车辆类型
			*/
			private Integer cheliangTypes;
				/**
				* 车辆类型的值
				*/
				private String cheliangValue;
			/**
			* 车辆状态
			*/
			private Integer cheliangStatusTypes;
				/**
				* 车辆状态的值
				*/
				private String cheliangStatusValue;
			/**
			* 车辆详情
			*/
			private String cheliangContent;

		//级联表 luxian
			/**
			* 路线编号
			*/
			private String luxianUuidNumber;
			/**
			* 路线信息
			*/
			private String luxianName;
			/**
			* 路线图片
			*/
			private String luxianPhoto;
			/**
			* 始发地
			*/
			private String yuangongAddress;
			/**
			* 目的地
			*/
			private String yuangongOadd;
			/**
			* 路线类型
			*/
			private Integer luxianTypes;
				/**
				* 路线类型的值
				*/
				private String luxianValue;
			/**
			* 路线详情
			*/
			private String luxianContent;

		//级联表 yundan
			/**
			* 运单信息 的 用户
			*/
			private Integer yundanYonghuId;
			/**
			* 送货地点
			*/
			private String yundanAddress;
			/**
			* 收件人
			*/
			private String yundanName;
			/**
			* 联系方式
			*/
			private String yundanPhone;
			/**
			* 运单状态
			*/
			private Integer yundanStatusTypes;
				/**
				* 运单状态的值
				*/
				private String yundanStatusValue;

	public WuliuView() {

	}

	public WuliuView(WuliuEntity wuliuEntity) {
		try {
			BeanUtils.copyProperties(this, wuliuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 物流状态的值
			*/
			public String getWuliuValue() {
				return wuliuValue;
			}
			/**
			* 设置： 物流状态的值
			*/
			public void setWuliuValue(String wuliuValue) {
				this.wuliuValue = wuliuValue;
			}




				//级联表的get和set cheliang

					/**
					* 获取： 车辆编号
					*/
					public String getCheliangUuidNumber() {
						return cheliangUuidNumber;
					}
					/**
					* 设置： 车辆编号
					*/
					public void setCheliangUuidNumber(String cheliangUuidNumber) {
						this.cheliangUuidNumber = cheliangUuidNumber;
					}

					/**
					* 获取： 车辆名称
					*/
					public String getCheliangName() {
						return cheliangName;
					}
					/**
					* 设置： 车辆名称
					*/
					public void setCheliangName(String cheliangName) {
						this.cheliangName = cheliangName;
					}

					/**
					* 获取： 车辆类型
					*/
					public Integer getCheliangTypes() {
						return cheliangTypes;
					}
					/**
					* 设置： 车辆类型
					*/
					public void setCheliangTypes(Integer cheliangTypes) {
						this.cheliangTypes = cheliangTypes;
					}


						/**
						* 获取： 车辆类型的值
						*/
						public String getCheliangValue() {
							return cheliangValue;
						}
						/**
						* 设置： 车辆类型的值
						*/
						public void setCheliangValue(String cheliangValue) {
							this.cheliangValue = cheliangValue;
						}

					/**
					* 获取： 车辆状态
					*/
					public Integer getCheliangStatusTypes() {
						return cheliangStatusTypes;
					}
					/**
					* 设置： 车辆状态
					*/
					public void setCheliangStatusTypes(Integer cheliangStatusTypes) {
						this.cheliangStatusTypes = cheliangStatusTypes;
					}


						/**
						* 获取： 车辆状态的值
						*/
						public String getCheliangStatusValue() {
							return cheliangStatusValue;
						}
						/**
						* 设置： 车辆状态的值
						*/
						public void setCheliangStatusValue(String cheliangStatusValue) {
							this.cheliangStatusValue = cheliangStatusValue;
						}

					/**
					* 获取： 车辆详情
					*/
					public String getCheliangContent() {
						return cheliangContent;
					}
					/**
					* 设置： 车辆详情
					*/
					public void setCheliangContent(String cheliangContent) {
						this.cheliangContent = cheliangContent;
					}













				//级联表的get和set luxian

					/**
					* 获取： 路线编号
					*/
					public String getLuxianUuidNumber() {
						return luxianUuidNumber;
					}
					/**
					* 设置： 路线编号
					*/
					public void setLuxianUuidNumber(String luxianUuidNumber) {
						this.luxianUuidNumber = luxianUuidNumber;
					}

					/**
					* 获取： 路线信息
					*/
					public String getLuxianName() {
						return luxianName;
					}
					/**
					* 设置： 路线信息
					*/
					public void setLuxianName(String luxianName) {
						this.luxianName = luxianName;
					}

					/**
					* 获取： 路线图片
					*/
					public String getLuxianPhoto() {
						return luxianPhoto;
					}
					/**
					* 设置： 路线图片
					*/
					public void setLuxianPhoto(String luxianPhoto) {
						this.luxianPhoto = luxianPhoto;
					}

					/**
					* 获取： 始发地
					*/
					public String getYuangongAddress() {
						return yuangongAddress;
					}
					/**
					* 设置： 始发地
					*/
					public void setYuangongAddress(String yuangongAddress) {
						this.yuangongAddress = yuangongAddress;
					}

					/**
					* 获取： 目的地
					*/
					public String getYuangongOadd() {
						return yuangongOadd;
					}
					/**
					* 设置： 目的地
					*/
					public void setYuangongOadd(String yuangongOadd) {
						this.yuangongOadd = yuangongOadd;
					}

					/**
					* 获取： 路线类型
					*/
					public Integer getLuxianTypes() {
						return luxianTypes;
					}
					/**
					* 设置： 路线类型
					*/
					public void setLuxianTypes(Integer luxianTypes) {
						this.luxianTypes = luxianTypes;
					}


						/**
						* 获取： 路线类型的值
						*/
						public String getLuxianValue() {
							return luxianValue;
						}
						/**
						* 设置： 路线类型的值
						*/
						public void setLuxianValue(String luxianValue) {
							this.luxianValue = luxianValue;
						}

					/**
					* 获取： 路线详情
					*/
					public String getLuxianContent() {
						return luxianContent;
					}
					/**
					* 设置： 路线详情
					*/
					public void setLuxianContent(String luxianContent) {
						this.luxianContent = luxianContent;
					}

















				//级联表的get和set yundan

					/**
					* 获取：运单信息 的 用户
					*/
					public Integer getYundanYonghuId() {
						return yundanYonghuId;
					}
					/**
					* 设置：运单信息 的 用户
					*/
					public void setYundanYonghuId(Integer yundanYonghuId) {
						this.yundanYonghuId = yundanYonghuId;
					}


					/**
					* 获取： 送货地点
					*/
					public String getYundanAddress() {
						return yundanAddress;
					}
					/**
					* 设置： 送货地点
					*/
					public void setYundanAddress(String yundanAddress) {
						this.yundanAddress = yundanAddress;
					}

					/**
					* 获取： 收件人
					*/
					public String getYundanName() {
						return yundanName;
					}
					/**
					* 设置： 收件人
					*/
					public void setYundanName(String yundanName) {
						this.yundanName = yundanName;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYundanPhone() {
						return yundanPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYundanPhone(String yundanPhone) {
						this.yundanPhone = yundanPhone;
					}

					/**
					* 获取： 运单状态
					*/
					public Integer getYundanStatusTypes() {
						return yundanStatusTypes;
					}
					/**
					* 设置： 运单状态
					*/
					public void setYundanStatusTypes(Integer yundanStatusTypes) {
						this.yundanStatusTypes = yundanStatusTypes;
					}


						/**
						* 获取： 运单状态的值
						*/
						public String getYundanStatusValue() {
							return yundanStatusValue;
						}
						/**
						* 设置： 运单状态的值
						*/
						public void setYundanStatusValue(String yundanStatusValue) {
							this.yundanStatusValue = yundanStatusValue;
						}




}
