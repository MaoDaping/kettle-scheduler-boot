package org.kettle.scheduler.system.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.kettle.scheduler.system.api.basic.BasicVO;

import java.io.Serializable;

/**
 * 作业表
 *
 * @author lyf
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "作业表-入参")
public class JobReq extends BasicVO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 分类ID（外键ID）
     */
    @ApiModelProperty(value = "分类ID")
    private Integer categoryId;

    /**
     * 作业名称
     */
    @ApiModelProperty(value = "作业名称")
    private String jobName;

    /**
     * 任务描述
     */
    @ApiModelProperty(value = "任务描述")
    private String jobDescription;

    /**
     * 执行类型（rep：资源库；file：文件）
     */
    @ApiModelProperty(value = "执行类型（rep：资源库；file：文件）")
    private String jobType;

    /**
     * 作业保存路径（可以是资源库中的路径也可以是服务器中保存作业文件的路径）
     */
    @ApiModelProperty(value = "作业保存路径")
    private String jobPath;

    /**
     * 作业的资源库ID
     */
    @ApiModelProperty(value = "作业的资源库ID")
    private Integer jobRepositoryId;

    /**
     * 定时策略（外键ID）
     */
    @ApiModelProperty(value = "定时策略")
    private Integer jobQuartz = 1;

    /**
     * 日志级别(Basic，Detailed，Error，Debug，Minimal，Rowlevel）
     */
    @ApiModelProperty(value = "日志级别")
    private String jobLogLevel;

    /**
     * 状态（1：正在运行；2：已停止）
     */
    @ApiModelProperty(value = "状态（1：正在运行；2：已停止）")
    private Integer jobStatus;


}