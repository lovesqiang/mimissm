package com.qiang.controller;

import com.github.pagehelper.PageInfo;
import com.qiang.pojo.Shop;
import com.qiang.service.ShopService;
import com.qiang.utils.FileNameUtil;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;

import java.util.List;

@Controller
@RequestMapping("/prod")
public class ShopAction {

    public final static Integer PAGE_SIZE = 5;

    String saveFileName;

    @Autowired
    private ShopService shopService;

    //显示全部商品不分页
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){

        List<Shop> list = shopService.getAll();

        request.setAttribute("list",list);

        return "product";
    }

    //显示全部商品（第一页）
    @RequestMapping("/split")
    public String split(HttpServletRequest request){

        PageInfo info = shopService.splitPage(1, PAGE_SIZE);

        request.setAttribute("info",info);

        return "product";

    }

    //ajax翻页
    @ResponseBody
    @RequestMapping("/ajaxsplit")
    public void ajaxSplit(Integer page, HttpSession session){

        PageInfo info = shopService.splitPage(page, PAGE_SIZE);

        session.setAttribute("info",info);

    }

    //图片的回显
    @ResponseBody
    @RequestMapping("/ajaxImg")
    public Object ajaxImg(MultipartFile shopImage, HttpServletRequest request){
        //要进行文件上传操作
        //取文件名
        saveFileName = FileNameUtil.getUUIDFileName() + FileNameUtil.getFileType(shopImage.getOriginalFilename());
        //取路径
        try {
            String path = request.getServletContext().getRealPath("/image");
            //转存
            shopImage.transferTo(new File(path + File.separator + saveFileName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //为了在客户端显示图片，要将存储的文件名回传下去，由于是自定义的上传插件，所以此处要手工处理JSON
        JSONObject object = new JSONObject();
        object.put("imgurl",saveFileName);
        //切记切记：JSON对象一定要toString()回到客户端
        return object.toString();
    }


    //执行增加操作
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Shop info, HttpServletRequest request) {

        //图片处理好后，设置到商品对象中
        info.setShopImage(saveFileName);
        info.setShopDate("2011/2/6");

        //到此为止，商品对象构建完毕，有自动从表单元素注入的，有上传图片的，有上架日期
        //完成数据库增加操作
        int num = -1;
        try {
            num = shopService.save(info);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (num > 0)
            request.getSession().setAttribute("msg", "增加成功！");
        else
            request.getSession().setAttribute("msg", "增加失败!");

        saveFileName="";
        //增删改后用重定向跳转
        return "forward:/prod/split.action";
    }


}
