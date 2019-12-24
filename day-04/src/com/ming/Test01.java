package com.ming;

public class Test01 {
    public static void main(String[] args){
        demo06();
        demo07();
        demo08();
        demo09();
        demo10();
        demo11();
        demo12();
    }

    /*
    * 1.public char charAt(int index):
    * 获取index位置上的字符。
    * 按照字符数组存储
    * */
    private static void demo12() {
        String str = "Java, Java";
        char c = str.charAt(1);
        System.out.println(c);
    }

    /*
    *      * public int compareTo(String anotherString):将当前字符串与参数字符串进行"比较" 按照字符编码值进行比较
     * 正数：当前字符串大于参数字符串
     * 负数：当前字符串小于参数字符串
     * 0：   当前字符串等于参数字符串
    * */
    private static void demo11() {
        String str = "a";
        int b = str.compareTo("b");
        System.out.println(b);
    }



    /*
    * public String concat(String str):
    * 将当前字符串与参数字符串"连接"，相当于+;
    * */
    private static void demo10() {
        String str = "hello ";
        System.out.println(str.concat("world"));
    }


    /*
    *  public boolean contains(CharSequence s):
    * 判断当前字符串中是否包含参数字符串(区分大小写)。
    * */
    private static void demo09() {
        String str = "java python go";
        System.out.println(str.contains("java"));
        System.out.println(str.contains("JAVA"));
    }


    /*
    * public boolean endsWith(String suffix)：判断当前字符串是否以参数字符串结尾。
    *
    * */
    private static void demo08() {
        String str = "Test.java";
        System.out.println(str.endsWith(".java"));
    }




    /*
    * public byte[] getBytes():将字符串转换为"字节数组"
    *
    * */
    private static void demo07() {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }
    }

    /*
    *  public int indexOf(String str):查询参数字符串在当前字符串中
    * 第一次出现的位置。如果没有包含，返
    * 回-1.
    *
    * */
    private static void demo06() {
        String str = "java scala java go scala";
        System.out.println(str.indexOf("scala"));
        System.out.println(str.indexOf("python"));
    }


}
