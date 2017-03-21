package com.thor.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

	private static final String SUCCESS = "success";
    /**
     * 1. ʹ��RequestMappingע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
     * "/WEB-INF/views/success.jsp"
     * @return
     */
//    @RequestMapping("/helloworld")
//    public String hello(){
//        System.out.println("hello world��");
//        return SUCCESS;
//    }
    
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value="id") Integer id){
        System.out.println("testPathVariable:" + id);
        return SUCCESS;
    }
    
    @RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
    public String testRestPut(@PathVariable(value="id") Integer id){
        System.out.println("test put:" + id);
        return SUCCESS;
    }
         
    @RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
    public String testRestDelete(@PathVariable(value="id") Integer id){
        System.out.println("test delete:" + id);
        return SUCCESS;
    }
         
    @RequestMapping(value="/testRest", method=RequestMethod.POST)
    public String testRest(){
        System.out.println("test post");
        return SUCCESS;
    }
         
    @RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
    public String testRest(@PathVariable(value="id") Integer id){
        System.out.println("test get:" + id);
        return SUCCESS;
    }
}
