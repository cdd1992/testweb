package com.zhongan.graphene.order.scenario.share.dto.order.request;

import java.io.Serializable;
import java.util.List;

import com.zhongan.graphene.components.enums.market.inform.InformCategoryEnum;
import com.zhongan.graphene.components.enums.order.CustomerTypeEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("订单客户告知入参")
public class OrderCustomerDeclarationRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 主键 */
    @ApiModelProperty(value = "主键",notes = "主键", dataType = "Long")
    private Long id;

    /** 订单ID */
    @ApiModelProperty(value = "订单ID",notes = "订单ID", dataType = "Long")
    private Long orderId;

    /** 订单客户ID */
    @ApiModelProperty(value = "订单客户ID",notes = "订单客户ID", dataType = "Long")
    private Long orderCustomerId;

    /** 需要存储的key */
    @ApiModelProperty(value = "需要存储的key",notes = "需要存储的key", dataType = "String")
    private String            key;

    /** 需要存储的value */
    @ApiModelProperty(value = "需要存储的result",notes = "需要存储的result", dataType = "AnswerResultRequestDTO")
    private AnswerResultRequestDTO    answerResultRequestDTO;
    
    /** 需要存储的value */
    @ApiModelProperty(value = "需要存储的value",notes = "需要存储的value", dataType = "AnswerRequestDTO")
    private List<AnswerRequestListDTO> answerRequestListDTO;

    /** 客户类型：1：投保人，2：被保险人 */
    @ApiModelProperty(value = "客户类型",notes = "客户类型", dataType = "CustomerTypeEnum")
    private CustomerTypeEnum customerType;

    /** 告知类型 1、健康告知 2、财务告知 */
    @ApiModelProperty(value = "告知类型",notes = "告知类型", dataType = "InformCategoryEnum")
    private InformCategoryEnum declarType;
    
}
2222222222222222222222222222222

public class A {

    int a=0;
 int a22=0;
}
