package com.service.hqhub.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.jpamodelgen.util.StringUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.hqhub.manager.F1DynFlightMgr;
import com.service.hqhub.model.form.FrmFlight;

import java.io.IOException;
import java.io.InputStream;
 
 


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class WeChatAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {

	private F1DynFlightMgr flightMgr;
	private HttpServletRequest request;
	private HttpServletResponse response;

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public F1DynFlightMgr getFlightMgr() {
		return flightMgr;
	}

	public void setFlightMgr(F1DynFlightMgr flightMgr) {
		this.flightMgr = flightMgr;
	}
/*
	public void weChatMsg() {

		String result = "";
		result = this.request.getParameter("Content");
		
		System.out.println(result);

		try {
			this.response.setCharacterEncoding("GBK");
			this.response.getWriter().print("aaaaaaaaaaa");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
*/
	/*
	public void weChatMsg(){
        System.out.println("----------post---------------");
        try {
            InputStream is = request.getInputStream();
            // 取HTTP请求流长度
            int size = request.getContentLength();
            // 用于缓存每次读取的数据
            byte[] buffer = new byte[size];
            // 用于存放结果的数组
            byte[] xmldataByte = new byte[size];
            int count = 0;
            int rbyte = 0;
            // 循环读取
            while (count < size) { 
                // 每次实际读取长度存于rbyte中
                rbyte = is.read(buffer); 
                for(int i=0;i<rbyte;i++) {
                    xmldataByte[count + i] = buffer[i];
                }
                count += rbyte;
            }
            is.close();
            String requestStr = new String(xmldataByte, "UTF-8");
            Document doc = DocumentHelper.parseText(requestStr);
            Element rootElt = doc.getRootElement();
            String content = rootElt.elementText("Content");
            String toUserName = rootElt.elementText("ToUserName");
            String fromUserName = rootElt.elementText("FromUserName");
            //得到所有的有用数据
            System.out.println(content+ ":" + toUserName + ":" + fromUserName);
            //文本消息
            if (content!=null) {
                String responseStr = "<xml>";
                responseStr += "<ToUserName><![CDATA[" + fromUserName
                        + "]]></ToUserName>";
                responseStr += "<FromUserName><![CDATA[" + toUserName
                        + "]]></FromUserName>";
                responseStr += "<CreateTime>" + System.currentTimeMillis()
                        + "</CreateTime>";
                responseStr += "<MsgType><![CDATA[text]]></MsgType>";
                responseStr += "<Content>Test WeChat!!"+content+"</Content>";
                responseStr += "<FuncFlag>0</FuncFlag>";
                responseStr += "</xml>";
                response.getWriter().write(responseStr);
            }
            //图文消息
            else if (content==null && "news".equals(content)) {
                String responseStr = "<xml>";
                responseStr += "<ToUserName><![CDATA[" + fromUserName
                        + "]]></ToUserName>";
                responseStr += "<FromUserName><![CDATA[" + toUserName
                        + "]]></FromUserName>";
                responseStr += "<CreateTime>" + System.currentTimeMillis()
                        + "</CreateTime>";
                responseStr += "<MsgType><![CDATA[news]]></MsgType>";
                responseStr += "<Content><![CDATA[]]></Content>";
 
                responseStr += "<ArticleCount>2</ArticleCount>";
 
                responseStr += "<Articles>";
                responseStr += "<item>";
                responseStr += "<Title><![CDATA[图文消息——红色石头]]></Title>";
                responseStr += "<Discription><![CDATA[图文消息正文——红色石头]]></Discription>";
                responseStr += "<PicUrl><![CDATA[http://redstones.sinaapp.com/res/images/redstones_wx_258.jpg]]></PicUrl>";
                responseStr += "<Url><![CDATA[http://redstones.sinaapp.com/]]></Url>";
                responseStr += "</item>";
 
                responseStr += "<item>";
                responseStr += "<Title><![CDATA[图文消息——红色石头]]></Title>";
                responseStr += "<Discription><![CDATA[图文消息正文——红色石头]]></Discription>";
                responseStr += "<PicUrl><![CDATA[http://redstones.sinaapp.com/res/images/redstones_wx_258.jpg]]></PicUrl>";
                responseStr += "<Url><![CDATA[http://redstones.sinaapp.com/]]></Url>";
                responseStr += "</item>";
 
                responseStr += "</Articles>";
                responseStr += "<FuncFlag>1</FuncFlag>";
                responseStr += "</xml>";
                response.getWriter().write(responseStr);
            }
            //不能识别
            else {
                String responseStr = "<xml>";
                responseStr += "<ToUserName><![CDATA[" + fromUserName
                        + "]]></ToUserName>";
                responseStr += "<FromUserName><![CDATA[" + toUserName
                        + "]]></FromUserName>";
                responseStr += "<CreateTime>" + System.currentTimeMillis()
                        + "</CreateTime>";
                responseStr += "<MsgType><![CDATA[text]]></MsgType>";
                responseStr += "<Content>输入text或者news返回相应类型的消息，另外推荐你关注 '红色石头'（完全采用Java完成），反馈和建议请到http://wzwahl36.net</Content>";
                responseStr += "<FuncFlag>0</FuncFlag>";
                responseStr += "</xml>";
                response.getWriter().write(responseStr);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
	
	
	public void weChatMsg(){
        System.out.println("----------post---------------");
        try {
        	
        	String result="";
        	
        	
            InputStream is = request.getInputStream();
            // 取HTTP请求流长度
            int size = request.getContentLength();
            // 用于缓存每次读取的数据
            byte[] buffer = new byte[size];
            // 用于存放结果的数组
            byte[] xmldataByte = new byte[size];
            int count = 0;
            int rbyte = 0;
            // 循环读取
            while (count < size) { 
                // 每次实际读取长度存于rbyte中
                rbyte = is.read(buffer); 
                for(int i=0;i<rbyte;i++) {
                    xmldataByte[count + i] = buffer[i];
                }
                count += rbyte;
            }
            is.close();
            String requestStr = new String(xmldataByte, "UTF-8");
            Document doc = DocumentHelper.parseText(requestStr);
            Element rootElt = doc.getRootElement();
            String content = rootElt.elementText("Content");
            String toUserName = rootElt.elementText("ToUserName");
            String fromUserName = rootElt.elementText("FromUserName");
            //得到所有的有用数据
            System.out.println(content+ ":" + toUserName + ":" + fromUserName);
            //文本消息
            result = searchByFid(content,null);
            if (content!=null) {
                String responseStr = "<xml>";
                responseStr += "<ToUserName><![CDATA[" + fromUserName
                        + "]]></ToUserName>";
                responseStr += "<FromUserName><![CDATA[" + toUserName
                        + "]]></FromUserName>";
                responseStr += "<CreateTime>" + System.currentTimeMillis()
                        + "</CreateTime>";
                responseStr += "<MsgType><![CDATA[text]]></MsgType>";
                responseStr += "<Content>"+result+"</Content>";
                responseStr += "<FuncFlag>0</FuncFlag>";
                responseStr += "</xml>";
                response.getWriter().write(responseStr);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	public String searchByFid(String fid,String fdate) throws Exception{

		
		ArrayList list = flightMgr.getFrmFlightListById(fid, fdate);
		System.out.println(list.size());
		FrmFlight flight =(FrmFlight)list.get(0);
		if(flight!=null){
			return flight.toString();
		}
		else {
			return "Nothing found!";
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
}
