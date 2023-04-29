package com.geekLearning.math;

import static java.math.BigDecimal.ZERO;
/**
 * todo 未考虑负数情况
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("transformTenToTwo1(Integer.MAX_VALUE) = " + transformTenToTwo1(Integer.MIN_VALUE));
        System.out.println("transformTenToTwo2(Integer.MAX_VALUE) = " + transformTenToTwo2(Integer.MIN_VALUE));
        System.out.println("transformTenToTwo3(0) = " + transformTenToTwo3(0));
    }

    /**
     * @Description: 十进制转二进制（方法一:余数短除法）
     * @author: scott
     * @date: 2023/4/8 12:38
     * @params: * @param ten:
     * @Return: java.lang.String
     */
    public static String transformTenToTwo1(int ten) {
        StringBuilder sb = new StringBuilder();
        while (ten != ZERO.intValue()) {
            sb.append(ten % 2);
            ten = ten >> 1;
        }
        return sb.reverse().toString();
    }

    /**
     * @Description: 十进制转二进制（方法二:降二次幂及减法混合运算）
     * @author: scott
     * @date: 2023/4/8 12:38
     * @params: * @param ten:
     * @Return: java.lang.String
     */
    public static String transformTenToTwo2(int ten) {
        StringBuilder sb = new StringBuilder();
        while (ten != ZERO.intValue()) {
            sb.append(ten % 2);
            ten = ten >> 1;
        }
        return sb.reverse().toString();
    }

    /**
     * @Description: 十进制转二进制（方法三:位运算法）
     * @author: scott
     * @date: 2023/4/8 12:38
     * @params: * @param ten:
     * @Return: java.lang.String
     */
    public static String transformTenToTwo3(int ten) {
        StringBuffer sb = new StringBuffer();
        while (ten != 0) {
            //此&运算，decimalSource & 1，目的是获取最低位的二进制数值
            sb.append(ten & 1);
            //此>>运算，decimalSource >> 1，目的是将获取到的最低位二进制数值除去
            ten = ten >> 1;
        }
        return sb.reverse().toString();
    }
}
