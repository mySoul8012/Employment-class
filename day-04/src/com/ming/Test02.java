package com.ming;

public class Test02 {
    public static void main(String[] args){
        demo01();
        demo02();
        demo03();
        demo04();
        demo05();
        demo06();
        demo07();
        demo08();
        demo09();
        demo10();
        demo11();
        demo12();
        demo13();
        demo14();
        demo15();
        demo16();
    }

    // public char charAt(int index):获取index位置上的字符。  按照字符数组存储
    private static void demo16() {
        String str = "我爱Java， Java爱我";
        char c = str.charAt(1);
        System.out.println(c);
    }

    //      * public int compareTo(String anotherString):将当前字符串与参数字符串进行"比较" 按照字符编码值进行比较
    //     * 正数：当前字符串大于参数字符串
    //     * 负数：当前字符串小于参数字符串
    //     * 0：   当前字符串等于参数字符串
    private static void demo15() {
        String str = "ac";
        int b = str.compareTo("ac");
        System.out.println(b);
    }

    // public String concat(String str):将当前字符串与参数字符串"连接"，相当于+;
    private static void demo14() {
        String str = "hello";
        System.out.println(str.concat("world"));
    }

    // public boolean contains(CharSequence s):判断当前字符串中是否包含参数字符串(区分大小写)。
    private static void demo13() {
        String str = "java python go";
        System.out.println(str.contains("java"));
        System.out.println(str.contains("Java"));
    }

    // 5.public boolean endsWith(String suffix)：判断当前字符串是否以参数字符串结尾。
    private static void demo12() {
        String str = "Test.java";
        System.out.println(str.endsWith(".java"));
    }

    // public byte[] getBytes():将字符串转换为"字节数组"
    private static void demo11() {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }
    }

    // public int indexOf(String str):查询参数字符串在当前字符串中第一次出现的位置。如果没有包含，返回-1.
    private static void demo10() {
        String str = "java scala java go scala";
        System.out.println(str.indexOf("scala"));
        System.out.println(str.indexOf("python"));

    }


    // public String replace(CharSequence a,CharSequence b)：将字符串中所有的a字符串，替换为b字符串。
    private static void demo09() {
        String str = "python go c go";
        System.out.println(str.replace("go", "java"));
    }

    private static void demo08() {
        String str = "我爱Java， Java爱我";
        System.out.println(str.startsWith("我"));
    }

    //  public String substring(int beginIndex)：截取字符串，从beginIndex开始，截取到结尾
    private static void demo07() {
        String str = "hello world";
        System.out.println(str.substring(6));
    }

    //  public String substring(int beginIndex,int endIndex)：截取字符串，截取：beginIndex 到 endIndex - 1的
    private static void demo06() {
        String str = "hello world";
        System.out.println(str.substring(7, 11));
    }

    // public char[] toCharArray()：将String转换为char[]数组
    private static void demo05() {
        String str = "hello";
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
    }

    //  public String trim():去掉字符串前后的空格(不包含中间的空格)
    private static void demo04() {
        String str = "ad ming";
        System.out.println(str.trim());
    }



    //  public static String valueOf(各种类型 i)：将各种类型数据转换为String。
    private static void demo03() {
        int a = 100;
        String s = String.valueOf(a);
        System.out.println(s);
    }

    // toLowerCase  ：将当前字符串中的所有英文字符转换为小写
    private static void demo02() {
        String str = "JAVA GO";
        System.out.println(str.toLowerCase());
    }

    // toUpperCase 将当前字符串中的所有英文字符转换为大写
    private static void demo01() {
        String str = "我爱Java";
        System.out.println(str.toUpperCase());
    }


}
