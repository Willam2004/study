package org.jiawa;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: panguanjing
 * Date: 14-1-7
 * Time: ����10:50
 * To change this template use File | Settings | File Templates.
 */
public class RssItemBean {
    private String title; //����
    private String description; //����
    private String author;//����
    private Date pubDate; //����ʱ��
    private String link;//���ӵ�ַ
    private String type; //����

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
