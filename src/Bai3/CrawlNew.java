package Bai3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNew {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/");
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
            sc.close();
            content = content.replaceAll("\\n+", "");
            content = content.replaceAll("\\<\\/a\\>", "");
            content = content.replaceAll("\\&quot[\\;]?+", "");
            Pattern p = Pattern.compile("article-title\">(.*?)</h3>");
            Matcher math = p.matcher(content);
            while (math.find()){
                String str = math.group(1);
                str = str.replaceAll("\\&qout\\;","");
                String[] arrStr = str.split("htm\">");
                System.out.println(arrStr[1] + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
