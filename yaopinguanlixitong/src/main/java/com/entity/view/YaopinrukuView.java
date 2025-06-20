package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YaopinrukuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 药品入库
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yaopinruku")
public class YaopinrukuView extends YaopinrukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 药品入库类型的值
	*/
	@ColumnInfo(comment="药品入库类型的字典表值",type="varchar(200)")
	private String yaopinrukuValue;

	//级联表 药品
		/**
		* 药品名称
		*/

		@ColumnInfo(comment="药品名称",type="varchar(200)")
		private String yaopinName;
		/**
		* 药品编号
		*/

		@ColumnInfo(comment="药品编号",type="varchar(200)")
		private String yaopinUuidNumber;
		/**
		* 药品照片
		*/

		@ColumnInfo(comment="药品照片",type="varchar(200)")
		private String yaopinPhoto;
		/**
		* 处方药
		*/
		@ColumnInfo(comment="处方药",type="int(11)")
		private Integer chufangyaoTypes;
			/**
			* 处方药的值
			*/
			@ColumnInfo(comment="处方药的字典表值",type="varchar(200)")
			private String chufangyaoValue;
		/**
		* 药品类型
		*/
		@ColumnInfo(comment="药品类型",type="int(11)")
		private Integer yaopinTypes;
			/**
			* 药品类型的值
			*/
			@ColumnInfo(comment="药品类型的字典表值",type="varchar(200)")
			private String yaopinValue;
		/**
		* 二级类型
		*/
		@ColumnInfo(comment="二级类型",type="int(11)")
		private Integer yaopinErjiTypes;
			/**
			* 二级类型的值
			*/
			@ColumnInfo(comment="二级类型的字典表值",type="varchar(200)")
			private String yaopinErjiValue;
		/**
		* 药品库存
		*/

		@ColumnInfo(comment="药品库存",type="int(11)")
		private Integer yaopinKucunNumber;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 药品原价
		*/
		@ColumnInfo(comment="药品原价",type="decimal(10,2)")
		private Double yaopinOldMoney;
		/**
		* 现价
		*/
		@ColumnInfo(comment="现价",type="decimal(10,2)")
		private Double yaopinNewMoney;
		/**
		* 药品热度
		*/

		@ColumnInfo(comment="药品热度",type="int(11)")
		private Integer yaopinClicknum;
		/**
		* 药品功效
		*/

		@ColumnInfo(comment="药品功效",type="longtext")
		private String yaopinGongxiaoContent;
		/**
		* 药品禁忌
		*/

		@ColumnInfo(comment="药品禁忌",type="longtext")
		private String yaopinJinjiContent;
		/**
		* 药品说明
		*/

		@ColumnInfo(comment="药品说明",type="longtext")
		private String yaopinContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yaopinDelete;
	//级联表 员工
		/**
		* 员工编号
		*/

		@ColumnInfo(comment="员工编号",type="varchar(200)")
		private String yuangongUuidNumber;
		/**
		* 员工姓名
		*/

		@ColumnInfo(comment="员工姓名",type="varchar(200)")
		private String yuangongName;
		/**
		* 员工手机号
		*/

		@ColumnInfo(comment="员工手机号",type="varchar(200)")
		private String yuangongPhone;
		/**
		* 员工身份证号
		*/

		@ColumnInfo(comment="员工身份证号",type="varchar(200)")
		private String yuangongIdNumber;
		/**
		* 员工照片
		*/

		@ColumnInfo(comment="员工照片",type="varchar(200)")
		private String yuangongPhoto;
		/**
		* 员工邮箱
		*/

		@ColumnInfo(comment="员工邮箱",type="varchar(200)")
		private String yuangongEmail;



	public YaopinrukuView() {

	}

	public YaopinrukuView(YaopinrukuEntity yaopinrukuEntity) {
		try {
			BeanUtils.copyProperties(this, yaopinrukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 药品入库类型的值
	*/
	public String getYaopinrukuValue() {
		return yaopinrukuValue;
	}
	/**
	* 设置： 药品入库类型的值
	*/
	public void setYaopinrukuValue(String yaopinrukuValue) {
		this.yaopinrukuValue = yaopinrukuValue;
	}


	//级联表的get和set 药品

		/**
		* 获取： 药品名称
		*/
		public String getYaopinName() {
			return yaopinName;
		}
		/**
		* 设置： 药品名称
		*/
		public void setYaopinName(String yaopinName) {
			this.yaopinName = yaopinName;
		}

		/**
		* 获取： 药品编号
		*/
		public String getYaopinUuidNumber() {
			return yaopinUuidNumber;
		}
		/**
		* 设置： 药品编号
		*/
		public void setYaopinUuidNumber(String yaopinUuidNumber) {
			this.yaopinUuidNumber = yaopinUuidNumber;
		}

		/**
		* 获取： 药品照片
		*/
		public String getYaopinPhoto() {
			return yaopinPhoto;
		}
		/**
		* 设置： 药品照片
		*/
		public void setYaopinPhoto(String yaopinPhoto) {
			this.yaopinPhoto = yaopinPhoto;
		}
		/**
		* 获取： 处方药
		*/
		public Integer getChufangyaoTypes() {
			return chufangyaoTypes;
		}
		/**
		* 设置： 处方药
		*/
		public void setChufangyaoTypes(Integer chufangyaoTypes) {
			this.chufangyaoTypes = chufangyaoTypes;
		}


			/**
			* 获取： 处方药的值
			*/
			public String getChufangyaoValue() {
				return chufangyaoValue;
			}
			/**
			* 设置： 处方药的值
			*/
			public void setChufangyaoValue(String chufangyaoValue) {
				this.chufangyaoValue = chufangyaoValue;
			}
		/**
		* 获取： 药品类型
		*/
		public Integer getYaopinTypes() {
			return yaopinTypes;
		}
		/**
		* 设置： 药品类型
		*/
		public void setYaopinTypes(Integer yaopinTypes) {
			this.yaopinTypes = yaopinTypes;
		}


			/**
			* 获取： 药品类型的值
			*/
			public String getYaopinValue() {
				return yaopinValue;
			}
			/**
			* 设置： 药品类型的值
			*/
			public void setYaopinValue(String yaopinValue) {
				this.yaopinValue = yaopinValue;
			}
		/**
		* 获取： 二级类型
		*/
		public Integer getYaopinErjiTypes() {
			return yaopinErjiTypes;
		}
		/**
		* 设置： 二级类型
		*/
		public void setYaopinErjiTypes(Integer yaopinErjiTypes) {
			this.yaopinErjiTypes = yaopinErjiTypes;
		}


			/**
			* 获取： 二级类型的值
			*/
			public String getYaopinErjiValue() {
				return yaopinErjiValue;
			}
			/**
			* 设置： 二级类型的值
			*/
			public void setYaopinErjiValue(String yaopinErjiValue) {
				this.yaopinErjiValue = yaopinErjiValue;
			}

		/**
		* 获取： 药品库存
		*/
		public Integer getYaopinKucunNumber() {
			return yaopinKucunNumber;
		}
		/**
		* 设置： 药品库存
		*/
		public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
			this.yaopinKucunNumber = yaopinKucunNumber;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 药品原价
		*/
		public Double getYaopinOldMoney() {
			return yaopinOldMoney;
		}
		/**
		* 设置： 药品原价
		*/
		public void setYaopinOldMoney(Double yaopinOldMoney) {
			this.yaopinOldMoney = yaopinOldMoney;
		}

		/**
		* 获取： 现价
		*/
		public Double getYaopinNewMoney() {
			return yaopinNewMoney;
		}
		/**
		* 设置： 现价
		*/
		public void setYaopinNewMoney(Double yaopinNewMoney) {
			this.yaopinNewMoney = yaopinNewMoney;
		}

		/**
		* 获取： 药品热度
		*/
		public Integer getYaopinClicknum() {
			return yaopinClicknum;
		}
		/**
		* 设置： 药品热度
		*/
		public void setYaopinClicknum(Integer yaopinClicknum) {
			this.yaopinClicknum = yaopinClicknum;
		}

		/**
		* 获取： 药品功效
		*/
		public String getYaopinGongxiaoContent() {
			return yaopinGongxiaoContent;
		}
		/**
		* 设置： 药品功效
		*/
		public void setYaopinGongxiaoContent(String yaopinGongxiaoContent) {
			this.yaopinGongxiaoContent = yaopinGongxiaoContent;
		}

		/**
		* 获取： 药品禁忌
		*/
		public String getYaopinJinjiContent() {
			return yaopinJinjiContent;
		}
		/**
		* 设置： 药品禁忌
		*/
		public void setYaopinJinjiContent(String yaopinJinjiContent) {
			this.yaopinJinjiContent = yaopinJinjiContent;
		}

		/**
		* 获取： 药品说明
		*/
		public String getYaopinContent() {
			return yaopinContent;
		}
		/**
		* 设置： 药品说明
		*/
		public void setYaopinContent(String yaopinContent) {
			this.yaopinContent = yaopinContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYaopinDelete() {
			return yaopinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYaopinDelete(Integer yaopinDelete) {
			this.yaopinDelete = yaopinDelete;
		}
	//级联表的get和set 员工

		/**
		* 获取： 员工编号
		*/
		public String getYuangongUuidNumber() {
			return yuangongUuidNumber;
		}
		/**
		* 设置： 员工编号
		*/
		public void setYuangongUuidNumber(String yuangongUuidNumber) {
			this.yuangongUuidNumber = yuangongUuidNumber;
		}

		/**
		* 获取： 员工姓名
		*/
		public String getYuangongName() {
			return yuangongName;
		}
		/**
		* 设置： 员工姓名
		*/
		public void setYuangongName(String yuangongName) {
			this.yuangongName = yuangongName;
		}

		/**
		* 获取： 员工手机号
		*/
		public String getYuangongPhone() {
			return yuangongPhone;
		}
		/**
		* 设置： 员工手机号
		*/
		public void setYuangongPhone(String yuangongPhone) {
			this.yuangongPhone = yuangongPhone;
		}

		/**
		* 获取： 员工身份证号
		*/
		public String getYuangongIdNumber() {
			return yuangongIdNumber;
		}
		/**
		* 设置： 员工身份证号
		*/
		public void setYuangongIdNumber(String yuangongIdNumber) {
			this.yuangongIdNumber = yuangongIdNumber;
		}

		/**
		* 获取： 员工照片
		*/
		public String getYuangongPhoto() {
			return yuangongPhoto;
		}
		/**
		* 设置： 员工照片
		*/
		public void setYuangongPhoto(String yuangongPhoto) {
			this.yuangongPhoto = yuangongPhoto;
		}

		/**
		* 获取： 员工邮箱
		*/
		public String getYuangongEmail() {
			return yuangongEmail;
		}
		/**
		* 设置： 员工邮箱
		*/
		public void setYuangongEmail(String yuangongEmail) {
			this.yuangongEmail = yuangongEmail;
		}


	@Override
	public String toString() {
		return "YaopinrukuView{" +
			", yaopinrukuValue=" + yaopinrukuValue +
			", yaopinName=" + yaopinName +
			", yaopinUuidNumber=" + yaopinUuidNumber +
			", yaopinPhoto=" + yaopinPhoto +
			", yaopinKucunNumber=" + yaopinKucunNumber +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", yaopinOldMoney=" + yaopinOldMoney +
			", yaopinNewMoney=" + yaopinNewMoney +
			", yaopinClicknum=" + yaopinClicknum +
			", yaopinGongxiaoContent=" + yaopinGongxiaoContent +
			", yaopinJinjiContent=" + yaopinJinjiContent +
			", yaopinContent=" + yaopinContent +
			", yaopinDelete=" + yaopinDelete +
			", yuangongUuidNumber=" + yuangongUuidNumber +
			", yuangongName=" + yuangongName +
			", yuangongPhone=" + yuangongPhone +
			", yuangongIdNumber=" + yuangongIdNumber +
			", yuangongPhoto=" + yuangongPhoto +
			", yuangongEmail=" + yuangongEmail +
			"} " + super.toString();
	}
}
