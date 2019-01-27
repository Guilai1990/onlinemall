package com.bruce.utils;

import com.bruce.VO.ResultVO;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 10:14
 * @Version 1.0
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();

        resultVO.setCode(0);
        resultVO.setMsg("success");
        resultVO.setData(object);

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
