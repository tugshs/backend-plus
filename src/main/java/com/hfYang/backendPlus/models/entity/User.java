package com.hfYang.backendPlus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 邮箱
     */
    @TableField(value = "user_email")
    private String userEmail;

    /**
     * 昵称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 账户
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 性别
     */
    @TableField(value = "user_gender")
    private String userGender;

    /**
     * 年龄
     */
    @TableField(value = "user_age")
    private Byte userAge;

    /**
     * 标签
     */
    @TableField(value = "user_tags")
    private String userTags;

    /**
     * 是否管理员
     */
    @TableField(value = "is_root")
    private Boolean isRoot;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_EMAIL = "user_email";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_PASSWORD = "user_password";

    public static final String COL_USER_ACCOUNT = "user_account";

    public static final String COL_USER_GENDER = "user_gender";

    public static final String COL_USER_AGE = "user_age";

    public static final String COL_USER_TAGS = "user_tags";

    public static final String COL_IS_ROOT = "is_root";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}