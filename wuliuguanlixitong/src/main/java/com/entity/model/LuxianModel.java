package com.entity.model;

import com.entity.LuxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物流路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LuxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 路线详情
     */
    private String luxianContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：路线编号
	 */
    public String getLuxianUuidNumber() {
        return luxianUuidNumber;
    }


    /**
	 * 设置：路线编号
	 */
    public void setLuxianUuidNumber(String luxianUuidNumber) {
        this.luxianUuidNumber = luxianUuidNumber;
    }
    /**
	 * 获取：路线信息
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 设置：路线信息
	 */
    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 获取：路线图片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 设置：路线图片
	 */
    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 获取：始发地
	 */
    public String getYuangongAddress() {
        return yuangongAddress;
    }


    /**
	 * 设置：始发地
	 */
    public void setYuangongAddress(String yuangongAddress) {
        this.yuangongAddress = yuangongAddress;
    }
    /**
	 * 获取：目的地
	 */
    public String getYuangongOadd() {
        return yuangongOadd;
    }


    /**
	 * 设置：目的地
	 */
    public void setYuangongOadd(String yuangongOadd) {
        this.yuangongOadd = yuangongOadd;
    }
    /**
	 * 获取：路线类型
	 */
    public Integer getLuxianTypes() {
        return luxianTypes;
    }


    /**
	 * 设置：路线类型
	 */
    public void setLuxianTypes(Integer luxianTypes) {
        this.luxianTypes = luxianTypes;
    }
    /**
	 * 获取：路线详情
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 设置：路线详情
	 */
    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
