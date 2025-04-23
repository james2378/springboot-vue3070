package com.entity.vo;

import com.entity.LuxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物流路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("luxian")
public class LuxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 路线编号
     */

    @TableField(value = "luxian_uuid_number")
    private String luxianUuidNumber;


    /**
     * 路线信息
     */

    @TableField(value = "luxian_name")
    private String luxianName;


    /**
     * 路线图片
     */

    @TableField(value = "luxian_photo")
    private String luxianPhoto;


    /**
     * 始发地
     */

    @TableField(value = "yuangong_address")
    private String yuangongAddress;


    /**
     * 目的地
     */

    @TableField(value = "yuangong_oadd")
    private String yuangongOadd;


    /**
     * 路线类型
     */

    @TableField(value = "luxian_types")
    private Integer luxianTypes;


    /**
     * 路线详情
     */

    @TableField(value = "luxian_content")
    private String luxianContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：路线编号
	 */
    public String getLuxianUuidNumber() {
        return luxianUuidNumber;
    }


    /**
	 * 获取：路线编号
	 */

    public void setLuxianUuidNumber(String luxianUuidNumber) {
        this.luxianUuidNumber = luxianUuidNumber;
    }
    /**
	 * 设置：路线信息
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 获取：路线信息
	 */

    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 设置：路线图片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 获取：路线图片
	 */

    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 设置：始发地
	 */
    public String getYuangongAddress() {
        return yuangongAddress;
    }


    /**
	 * 获取：始发地
	 */

    public void setYuangongAddress(String yuangongAddress) {
        this.yuangongAddress = yuangongAddress;
    }
    /**
	 * 设置：目的地
	 */
    public String getYuangongOadd() {
        return yuangongOadd;
    }


    /**
	 * 获取：目的地
	 */

    public void setYuangongOadd(String yuangongOadd) {
        this.yuangongOadd = yuangongOadd;
    }
    /**
	 * 设置：路线类型
	 */
    public Integer getLuxianTypes() {
        return luxianTypes;
    }


    /**
	 * 获取：路线类型
	 */

    public void setLuxianTypes(Integer luxianTypes) {
        this.luxianTypes = luxianTypes;
    }
    /**
	 * 设置：路线详情
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 获取：路线详情
	 */

    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
