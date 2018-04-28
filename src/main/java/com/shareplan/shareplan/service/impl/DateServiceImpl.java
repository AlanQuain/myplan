package com.shareplan.shareplan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shareplan.shareplan.mapper.DateMapper;
import com.shareplan.shareplan.model.ContentVo;
import com.shareplan.shareplan.model.ContentVoExample;
import com.shareplan.shareplan.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YangKui on 2018/4/28
 */
@Service
public class DateServiceImpl implements DataService {

    @Autowired
    DateMapper dateMapper;


    @Override
    public PageInfo<ContentVo> getArticlesWithpage(ContentVoExample contentVoExample, int page, int limit) {
        PageHelper.startPage(page, limit);
        List<ContentVo> contentVos = dateMapper.selectByExampleWithBLOBs(contentVoExample);
        return new PageInfo<>(contentVos);
    }
}
