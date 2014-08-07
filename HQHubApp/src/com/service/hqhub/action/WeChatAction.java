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
            // ȡHTTP����������
            int size = request.getContentLength();
            // ���ڻ���ÿ�ζ�ȡ������
            byte[] buffer = new byte[size];
            // ���ڴ�Ž��������
            byte[] xmldataByte = new byte[size];
            int count = 0;
            int rbyte = 0;
            // ѭ����ȡ
            while (count < size) { 
                // ÿ��ʵ�ʶ�ȡ���ȴ���rbyte��
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
            //�õ����е���������
            System.out.println(content+ ":" + toUserName + ":" + fromUserName);
            //�ı���Ϣ
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
            //ͼ����Ϣ
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
                responseStr += "<Title><![CDATA[ͼ����Ϣ������ɫʯͷ]]></Title>";
                responseStr += "<Discription><![CDATA[ͼ����Ϣ���ġ�����ɫʯͷ]]></Discription>";
                responseStr += "<PicUrl><![CDATA[http://redstones.sinaapp.com/res/images/redstones_wx_258.jpg]]></PicUrl>";
                responseStr += "<Url><![CDATA[http://redstones.sinaapp.com/]]></Url>";
                responseStr += "</item>";
 
                responseStr += "<item>";
                responseStr += "<Title><![CDATA[ͼ����Ϣ������ɫʯͷ]]></Title>";
                responseStr += "<Discription><![CDATA[ͼ����Ϣ���ġ�����ɫʯͷ]]></Discription>";
                responseStr += "<PicUrl><![CDATA[http://redstones.sinaapp.com/res/images/redstones_wx_258.jpg]]></PicUrl>";
                responseStr += "<Url><![CDATA[http://redstones.sinaapp.com/]]></Url>";
                responseStr += "</item>";
 
                responseStr += "</Articles>";
                responseStr += "<FuncFlag>1</FuncFlag>";
                responseStr += "</xml>";
                response.getWriter().write(responseStr);
            }
            //����ʶ��
            else {
                String responseStr = "<xml>";
                responseStr += "<ToUserName><![CDATA[" + fromUserName
                        + "]]></ToUserName>";
                responseStr += "<FromUserName><![CDATA[" + toUserName
                        + "]]></FromUserName>";
                responseStr += "<CreateTime>" + System.currentTimeMillis()
                        + "</CreateTime>";
                responseStr += "<MsgType><![CDATA[text]]></MsgType>";
                responseStr += "<Content>����text����news������Ӧ���͵���Ϣ�������Ƽ����ע '��ɫʯͷ'����ȫ����Java��ɣ��������ͽ����뵽http://wzwahl36.net</Content>";
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
            // ȡHTTP����������
            int size = request.getContentLength();
            // ���ڻ���ÿ�ζ�ȡ������
            byte[] buffer = new byte[size];
            // ���ڴ�Ž��������
            byte[] xmldataByte = new byte[size];
            int count = 0;
            int rbyte = 0;
            // ѭ����ȡ
            while (count < size) { 
                // ÿ��ʵ�ʶ�ȡ���ȴ���rbyte��
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
            //�õ����е���������
            System.out.println(content+ ":" + toUserName + ":" + fromUserName);
            //�ı���Ϣ
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
