package com.lf.yapin.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.yapin.pms.entity.ProductAttributeValue;
import com.lf.yapin.pms.mapper.ProductAttributeValueMapper;
import com.lf.yapin.pms.service.ProductAttributeValueService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author lf
 * @since 2020-03-12
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}
