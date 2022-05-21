package com.coding.Test.内部类;

import java.util.ArrayList;
import java.util.List;

// 测试访问私有成员内部类的的公开方法
public class AccessPrivateInnerClassPublicMethod {

    public static Formatter Location(String longitute, String latitude) {
        return new LocationBasedFormatter(longitute, latitude);
    }

    public interface Formatter {
        List<String> locationFinder();
    }

    private static final class LocationBasedFormatter implements Formatter {
        private String longitute;
        private String latitude;

        public LocationBasedFormatter(String longitute, String latitude) {
            this.longitute = longitute;
            this.latitude = latitude;
        }

        public final List< String > locationFinder() {
            String location = "Your Long: " + this.longitute + " Your Lat: " + this.latitude;
            List < String > randomList = new ArrayList< String >();
            randomList.add(location);
            return randomList;
        }
    }

    // 方法一：在本类中访问
    // 方法二：外部其他类通过本类的一个public方法间接调用私有化内部类的方法
    public static void main(String[] args) {
        Formatter locationBasedFormatter = AccessPrivateInnerClassPublicMethod.Location("44.54", "94.54");
        List<String> strings = locationBasedFormatter.locationFinder();
        System.out.println(strings);
    }
}
