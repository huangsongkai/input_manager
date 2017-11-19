package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by huang on 2017/11/19.
 */
@Entity
@Data
//种子购买记录
public class SeedBuyList implements NeedsOwner {
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
     * 非转基因证明
     */
    String nonGMOProveUrl;
    /**
     * 未经禁用物质处理证明
     * banned substance
     */
    String bannedSubstanceProveUrl;

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
