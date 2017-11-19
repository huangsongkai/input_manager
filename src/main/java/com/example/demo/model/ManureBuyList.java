package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by huang on 2017/11/19.
 */
@Entity
@Data
//肥料购买记录
public class ManureBuyList implements NeedsOwner{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    /**
     * 商品名称
     */
    String productName;
    /**
     * 生产厂家
     */
    String manufacturer;
    /**
     * 销售企业
     */
    String sellEnterprise;
    /**
     * 主要成分及含量
     */
    String compositionOrContent;  
    /**
     * 购买数量
     */
    Double buyNum;
    /**
     * 购买时间
     */
    Date buyDate;
    /**
     * 责任人
     */
    String dutyName;
    /**
     * 备注
     */
    String remarks;

    /**
     * 购买单据
     */
    String sellVoucherUrl;
    /**
     * 外包装袋子
     * packing bag
     */
    String packingBagUrl;


    /**
     * 权限
     */
    String username;
    /**
     * 创建时间
     */
    @Column(columnDefinition = "TIMESTAMP")
    Date createTime;
}
