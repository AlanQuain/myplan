package com.shareplan.shareplan.controller;

import com.github.pagehelper.PageInfo;
import com.shareplan.shareplan.dto.Types;
import com.shareplan.shareplan.exception.TipException;
import com.shareplan.shareplan.model.ContentVo;
import com.shareplan.shareplan.model.ContentVoExample;
import com.shareplan.shareplan.service.DataService;
import com.sun.net.httpserver.HttpsConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by YangKui on 2018/4/28
 */
@Controller
@RequestMapping("/admin/article")
@Transactional(rollbackFor = TipException.class)
public class DataController extends BaseController {


    @Autowired
    DataService dataService;

    @GetMapping(value = "")
    public String index(@RequestParam(value = "page",defaultValue ="1") int page,
                        @RequestParam(value = "limit",defaultValue = "15")int limit, HttpServletRequest request){
        ContentVoExample contentVoExample = new ContentVoExample();
        contentVoExample.setOrderByClause("created desc");
        contentVoExample.createCriteria().andTypeEqualTo(Types.ARTICLE.getType());
        PageInfo<ContentVo> contentsPaginator = dataService.getArticlesWithpage(contentVoExample, page, limit);
        request.setAttribute("articles", contentsPaginator);
        return "admin/article_list";
    }


}
