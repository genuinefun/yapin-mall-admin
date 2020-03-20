package com.lf.yapin.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.yapin.pms.entity.Album;
import com.lf.yapin.pms.mapper.AlbumMapper;
import com.lf.yapin.pms.service.AlbumService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author lf
 * @since 2020-03-12
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
