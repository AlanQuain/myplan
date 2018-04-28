package com.shareplan.shareplan.mapper;

import com.shareplan.shareplan.model.ContentVo;
import com.shareplan.shareplan.model.ContentVoExample;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by YangKui on 2018/4/28
 */
@Component
public interface DateMapper {

    List<ContentVo> selectByExampleWithBLOBs(ContentVoExample contentVoExample);
}
