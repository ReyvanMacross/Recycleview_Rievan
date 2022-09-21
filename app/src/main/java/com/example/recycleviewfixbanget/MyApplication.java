package com.example.recycleviewfixbanget;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {
    private static List<President> presidentList = new ArrayList<>();
    private static int nextId = 10;

    public MyApplication() {
        fillPresidentList();
    }


    private void fillPresidentList() {
        President p0 = new President(0,"George Blm",1788,  "https://s.abcnews.com/images/US/george-floyd-ap-jt-200529_hpMain_2_1x1_992.jpg");
        President p1 = new President(1,"Jump man",1930,"https://www.nicekicks.com/files/2020/06/air-jordan-jumpman-logo.jpg");
        President p2 = new President(2,"Jordan",1982,"https://media-cldnry.s-nbcnews.com/image/upload/t_fit-760w,f_auto,q_auto:best/newscms/2014_19/425336/140507-jordan-0419.jpg");
        President p3 = new President(3,"Drake",1992,"https://media1.popsugar-assets.com/files/thumbor/zan-t_Me63if8oqWYE9ENiPLlhA/0x224:2826x3050/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2020/02/11/894/n/1922398/87f6bb525e430e7bd44e40.22278576_/i/Drake.jpg");
        President p4 = new President(4,"Freddie Mercury",1958,"https://cdn.britannica.com/38/200938-050-E22981D1/Freddie-Mercury-Live-Aid-Queen-Wembley-Stadium-July-13-1985.jpg");
        President p5 = new President(5,"Michael Jackson",1960,"https://cdn0-production-images-kly.akamaized.net/hDB2CDoNtj7ff0j3Y3ST9O0CbZY=/1200x1200/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1291025/original/092263500_1468822763-Michael_Jackson.jpg");

        presidentList.addAll(Arrays.asList(p0,p1,p2,p3,p4,p5));
    }

    public static List<President> getPresidentList() {
        return presidentList;
    }

    public static void setPresidentList(List<President> presidentList) {
        MyApplication.presidentList = presidentList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
