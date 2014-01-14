package org.jiawa;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: panguanjing
 * Date: 14-1-7
 * Time: ÏÂÎç10:48
 */
public class RssReader {

    public static void main(String[] args) {
        RssReader rssReader = new RssReader();
        rssReader.readFromUrl("http://coolshell.cn/feed");
    }

    public List<RssItemBean> readFromUrl(String url) {
        try{
            URL content = new URL(url);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(content));
            List list =feed.getEntries();
            SyndEntry syndEntry = (SyndEntry) list.get(0);

            System.out.println(list.get(0));
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
        }catch (Exception e){

        }
        return null;
    }
}

