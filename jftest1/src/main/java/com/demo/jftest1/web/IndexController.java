package com.demo.jftest1.web;

import com.jfinal.core.Controller;

/**
 * Created by zhenyu on 2018/8/15.
 */
public class IndexController extends Controller{
    public void index(){
        renderText("OK!");
    }
}
