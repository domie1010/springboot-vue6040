package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 药品入库
 *
 * @author 
 * @email
 */
@TableName("yaopinruku")
public class YaopinrukuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaopinrukuEntity() {

	}

	public YaopinrukuEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 药品
     */
    @ColumnInfo(comment="药品",type="int(11)")
    @TableField(value = "yaopin_id")

    private Integer yaopinId;


    /**
     * 员工
     */
    @ColumnInfo(comment="员工",type="int(11)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 药品入库编号
     */
    @ColumnInfo(comment="药品入库编号",type="varchar(200)")
    @TableField(value = "yaopinruku_uuid_number")

    private String yaopinrukuUuidNumber;


    /**
     * 入库标题
     */
    @ColumnInfo(comment="入库标题",type="varchar(200)")
    @TableField(value = "yaopinruku_name")

    private String yaopinrukuName;


    /**
     * 药品入库类型
     */
    @ColumnInfo(comment="药品入库类型",type="int(11)")
    @TableField(value = "yaopinruku_types")

    private Integer yaopinrukuTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "yaopinruku_file")

    private String yaopinrukuFile;


    /**
     * 入库数量
     */
    @ColumnInfo(comment="入库数量",type="int(11)")
    @TableField(value = "yaopinruku_number")

    private Integer yaopinrukuNumber;


    /**
     * 入库时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="入库时间",type="timestamp")
    @TableField(value = "yaopinruku_time")

    private Date yaopinrukuTime;


    /**
     * 入库缘由
     */
    @ColumnInfo(comment="入库缘由",type="longtext")
    @TableField(value = "yaopinruku_content")

    private String yaopinrukuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：药品
	 */
    public Integer getYaopinId() {
        return yaopinId;
    }
    /**
	 * 设置：药品
	 */

    public void setYaopinId(Integer yaopinId) {
        this.yaopinId = yaopinId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }
    /**
	 * 设置：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：药品入库编号
	 */
    public String getYaopinrukuUuidNumber() {
        return yaopinrukuUuidNumber;
    }
    /**
	 * 设置：药品入库编号
	 */

    public void setYaopinrukuUuidNumber(String yaopinrukuUuidNumber) {
        this.yaopinrukuUuidNumber = yaopinrukuUuidNumber;
    }
    /**
	 * 获取：入库标题
	 */
    public String getYaopinrukuName() {
        return yaopinrukuName;
    }
    /**
	 * 设置：入库标题
	 */

    public void setYaopinrukuName(String yaopinrukuName) {
        this.yaopinrukuName = yaopinrukuName;
    }
    /**
	 * 获取：药品入库类型
	 */
    public Integer getYaopinrukuTypes() {
        return yaopinrukuTypes;
    }
    /**
	 * 设置：药品入库类型
	 */

    public void setYaopinrukuTypes(Integer yaopinrukuTypes) {
        this.yaopinrukuTypes = yaopinrukuTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getYaopinrukuFile() {
        return yaopinrukuFile;
    }
    /**
	 * 设置：附件
	 */

    public void setYaopinrukuFile(String yaopinrukuFile) {
        this.yaopinrukuFile = yaopinrukuFile;
    }
    /**
	 * 获取：入库数量
	 */
    public Integer getYaopinrukuNumber() {
        return yaopinrukuNumber;
    }
    /**
	 * 设置：入库数量
	 */

    public void setYaopinrukuNumber(Integer yaopinrukuNumber) {
        this.yaopinrukuNumber = yaopinrukuNumber;
    }
    /**
	 * 获取：入库时间
	 */
    public Date getYaopinrukuTime() {
        return yaopinrukuTime;
    }
    /**
	 * 设置：入库时间
	 */

    public void setYaopinrukuTime(Date yaopinrukuTime) {
        this.yaopinrukuTime = yaopinrukuTime;
    }
    /**
	 * 获取：入库缘由
	 */
    public String getYaopinrukuContent() {
        return yaopinrukuContent;
    }
    /**
	 * 设置：入库缘由
	 */

    public void setYaopinrukuContent(String yaopinrukuContent) {
        this.yaopinrukuContent = yaopinrukuContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yaopinruku{" +
            ", id=" + id +
            ", yaopinId=" + yaopinId +
            ", yuangongId=" + yuangongId +
            ", yaopinrukuUuidNumber=" + yaopinrukuUuidNumber +
            ", yaopinrukuName=" + yaopinrukuName +
            ", yaopinrukuTypes=" + yaopinrukuTypes +
            ", yaopinrukuFile=" + yaopinrukuFile +
            ", yaopinrukuNumber=" + yaopinrukuNumber +
            ", yaopinrukuTime=" + DateUtil.convertString(yaopinrukuTime,"yyyy-MM-dd") +
            ", yaopinrukuContent=" + yaopinrukuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
