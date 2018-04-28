package com.shareplan.shareplan.service;

import com.github.pagehelper.PageInfo;
import com.shareplan.shareplan.model.ContentVo;
import com.shareplan.shareplan.model.ContentVoExample;

/**
 * Created by YangKui on 2018/4/28
 */
public interface DataService {

    PageInfo<ContentVo> getArticlesWithpage(ContentVoExample contentVoExample, int page, int limit);
}
