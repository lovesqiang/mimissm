package com.qiang.listener;

import com.qiang.pojo.ShopType;
import com.qiang.service.Impl.ShopTypeServiceImpl;
import com.qiang.service.ShopTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public class ShopTypeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        //手工从spring容器中获取ShopTypeServiceImpl对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_*.xml");

        //只能是接口，不能是接口实现类
        ShopTypeService shopTypeServiceImpl = (ShopTypeService) context.getBean("ShopTypeServiceImpl");

        List<ShopType> typeList = shopTypeServiceImpl.getAll();

        servletContextEvent.getServletContext().setAttribute("typeList",typeList);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
