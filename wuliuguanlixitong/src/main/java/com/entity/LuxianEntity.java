package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 物流路线
 *
 * @author 
 * @email
 */
@TableName("luxian")
public class LuxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LuxianEntity() {

	}

	public LuxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Luxian{" +
            "id=" + id +
            ", luxianUuidNumber=" + luxianUuidNumber +
            ", luxianName=" + luxianName +
            ", luxianPhoto=" + luxianPhoto +
            ", yuangongAddress=" + yuangongAddress +
            ", yuangongOadd=" + yuangongOadd +
            ", luxianTypes=" + luxianTypes +
            ", luxianContent=" + luxianContent +
            ", createTime=" + createTime +
        "}";
    }
}
