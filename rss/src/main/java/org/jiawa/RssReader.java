package org.jiawa;

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

    }

    public List<RssItemBean> readFromUrl(String url) {
        try{
            URL content = new URL(url);
            InputStream is =
                    content.openStream();

            BufferedReader br
                    = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String r = br.readLine();
            while (r != null) {
                sb.append(r);
                r = br.readLine();
            }
            System.out.println(sb.toString());
        }catch (Exception e){

        }
        return null;
    }
}

