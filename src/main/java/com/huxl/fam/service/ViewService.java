package com.huxl.fam.service;

import com.huxl.fam.vo.BarVo;
import com.huxl.fam.vo.ConditionVo;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ViewService
 * 作者:huxl_oup
 * 日期:2019/4/21 16:25
 * 描述：视图处理
 */
public interface ViewService {
    List<BarVo> queryByDate(ConditionVo cvo);
}
