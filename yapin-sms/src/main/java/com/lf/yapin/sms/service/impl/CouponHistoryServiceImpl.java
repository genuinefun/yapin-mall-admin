package com.lf.yapin.sms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.yapin.sms.entity.CouponHistory;
import com.lf.yapin.sms.mapper.CouponHistoryMapper;
import com.lf.yapin.sms.service.CouponHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券使用、领取历史表 服务实现类
 * </p>
 *
 * @author lf
 * @since 2020-03-12
 */
@Service
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistory> implements CouponHistoryService {

}
