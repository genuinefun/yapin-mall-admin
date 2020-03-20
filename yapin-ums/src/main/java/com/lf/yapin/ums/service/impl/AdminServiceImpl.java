package com.lf.yapin.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.yapin.ums.entity.Admin;
import com.lf.yapin.ums.mapper.AdminMapper;
import com.lf.yapin.ums.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author lf
 * @since 2020-03-12
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
