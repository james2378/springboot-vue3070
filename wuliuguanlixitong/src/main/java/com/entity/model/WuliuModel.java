package com.entity.model;

import com.entity.WuliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物流信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WuliuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物流单号
     */
    private String wuliuUuidNumber;


    /**
     * 车辆
     */
    private Integer cheliangId;


    /**
     * 路线
     */
    private Integer luxianId;


    /**
     * 运单
     */
    private Integer yundanId;


    /**
     * 物流状态
     */
    private Integer wuliuTypes;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：物流单号
	 */
    public String getWuliuUuidNumber() {
        return wuliuUuidNumber;
    }


    /**
	 * 设置：物流单号
	 */
    public void setWuliuUuidNumber(String wuliuUuidNumber) {
        this.wuliuUuidNumber = wuliuUuidNumber;
    }
    /**
	 * 获取：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }


    /**
	 * 设置：车辆
	 */
    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 获取：路线
	 */
    public Integer getLuxianId() {
        return luxianId;
    }


    /**
	 * 设置：路线
	 */
    public void setLuxianId(Integer luxianId) {
        this.luxianId = luxianId;
    }
    /**
	 * 获取：运单
	 */
    public Integer getYundanId() {
        return yundanId;
    }


    /**
	 * 设置：运单
	 */
    public void setYundanId(Integer yundanId) {
        this.yundanId = yundanId;
    }
    /**
	 * 获取：物流状态
	 */
    public Integer getWuliuTypes() {
        return wuliuTypes;
    }


    /**
	 * 设置：物流状态
	 */
    public void setWuliuTypes(Integer wuliuTypes) {
        this.wuliuTypes = wuliuTypes;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
