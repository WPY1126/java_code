package com.wpy.demo1;


/*第一个JAVA程序，输出
public class base01 {
    public static void main(String[] args) {
        System.out.println("hello world");

    }
}
*/

/*输入
public class base01 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

    }
}

 */


//基础--------------------------------------------------------
/*
请用代码描述下列银行流水变化过程：

        1. 小明账户bankBalance初始值有500.00元
        2. 存入250元
        3. 支出100元
        4. 打印剩余存款
public class base01 {
    public static void main(String[] args) {
      double bankBalance = 500;
      bankBalance = bankBalance + 250;
      bankBalance = bankBalance - 100;
        System.out.println(bankBalance);
    }
}

 */



/*
变量应该是先声哪后使用,请完成下面代码

        A.声明字符串型变量name

        B.声明字符串型变量birthday

        C.声明整数类型变量age

        D.声明float类型变量money
public class base01 {
    public static void main(String[] args) {
        String name = "steven";
        String birthday = "1999-11-26";
        int age = 23;
        float money = 1000f;
        System.out.println(name);
        System.out.println(birthday);
        System.out.println(age);
        System.out.println(money);
    }
}

 */



/*
在java语言中，定义变量必须明确变量的数据类型。
八种基本数据类型包括:
byte、short、int、long、float、double、char、boolean。

public  class base01 {
    public static void main(String[] args) {
        byte b = 100;//byte[-128~127]
        System.out.println(b);

        short s = 2000;
        System.out.println(s);

        int i = 666;
        System.out.println(i);

        long l = 999999999;
        System.out.println(l);

        float f = 123.456f;
        System.out.println(f);

        double d = 456.789;
        System.out.println(d);

        char c = 'c';
        System.out.println(c);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
    }
}

 */



/*
输出一下格式代码：
        ************************
        我的姓名是：张三
        我的性别是：男
        我的年龄是：18
        我的地址是：xx省xx市
        我的饭卡余额是：55.55元
        ************************

public class base01 {
    public static void main(String[] args) {
        System.out.println("************************");

      String name = "张三";
        System.out.println("我的名字是："+name);

      String gender = "男";
        System.out.println("我的性别是："+gender);

      int age = 23;
        System.out.println("我的年龄是："+age);

      String adress = "河科大";
        System.out.println("我的地址是："+adress);

      float money = 55.55f;
        System.out.println("我的饭卡余额是："+money);

        System.out.println("************************");
    }
}

 */


//字符串------------------------------------------------------

/*
身高是具有遗传性的，子女的身高和父母的身高有一定的关系。
假定，父母和子女的身高遗传关系如下：
儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

public class base01 {
    public static void main(String[] args) {
        int father = 177;
        int mother = 165;
        double son = (father + mother) * 1.08 / 2;
        double daugther = (father * 0.923 + mother) / 2;
        System.out.println("儿子身高："+son);
        System.out.println("女儿身高："+daugther);
    }
}

 */


/*
红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
那么红茶和绿茶现在的钱一样多，请问对么？

public class base01 {
    public static void main(String[] args) {
        int red = 21;
        int green = 24;
        red = red * 2 + 3;
        green = green * 2;

        System.out.println(red == green);
    }
}

 */


/*某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
那么这个小伙要点这三样东西，最少要花多少钱？

public class base01 {
    public static void main(String[] args) {
        double money;
        double money1 = 24 + 8 + 3;
        money1 = (money1 > 30 ? money1 * 0.8 : money1);//判断是否满30元打八折

        int money2 = 16 + 8 + 3;//使用优惠价

        money = (money1 < money2 ? money1 : money2);

        System.out.println(money);
    }
}

 */


/*
数字6是一个真正伟大的数字，键盘录入两个整数。
如果其中一个为6，最终结果输出true。
如果它们的和为6的倍数。最终结果输出true。
其他情况都是false。

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        int n2 = s2.nextInt();

        if(n1 == 6 || n2 == 6)
        {
            System.out.println("ture");
        }

        else if ((n1 + n2) % 6 == 0)
        {
            System.out.println("true");
        }

        else
        {
            System.out.println("false");
        }
    }
}

 */


/*
键盘录入一个三位数，求这个三位数每一位的数字和。
举例：
键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：6。

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner n = new Scanner(System.in);
        int i = n.nextInt();

        int hundred, ten, digit;
        hundred = ten = digit = 0;

        hundred = i / 100;
        ten = (i / 10) % 10;
        digit = i % 10;

        System.out.println(hundred + ten + digit);

    }
}

 */


//判断和循环---------------------------------------------------


/*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
为了更省钱，李雷要不要以旧换新？

public class base01 {
    public static void main(String[] args) {
        double new_phone = 7988;
        double old_phone = 1500;
        double sum1,sum2;

        sum1 = new_phone - old_phone;
        sum2 = new_phone * 0.8;

        if(sum1 > sum2) {
            System.out.println("李雷要以旧换新");
        }

        else {
            System.out.println("李雷不要以旧换新");
        }
    }
}

 */

/*
让用户依次录入三个整数，打印出最大值，中间值，最小值。

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max1 = (n1 > n2 ? n1 : n2);
        int max2 = (max1 > n3 ? max1 : n3);
        int min1 = (n1 < n2 ? n1 : n2);
        int min2 = (min1 < n3 ? min1 : n3);
        int mid = (n1 + n2 + n3) - ( max2 + min2);

        System.out.println("最大值："+max2);
        System.out.println("中间值："+mid);
        System.out.println("最小值："+min1);

    }
}

 */


/*
某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。
存款年利率表如下：

存期		年利率（%）

一年		2.25
两年		2.7
三年		3.25
五年		3.6

请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
提示：
存入金额和存入年限均由键盘录入
本息计算方式：本金+本金×年利率×年限

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        System.out.println("请输入存款金额和年限：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double year = sc.nextDouble();
        double sum = 0;

        if (year == 1){
            sum = money + money * year * 0.0225;
            System.out.println("到期本息总额："+sum);
        }

        else if(year == 2){
            sum = money + money * year * 0.027;
            System.out.println("到期本息总额："+sum);
        }

        else if(year == 3){
            sum = money + money * year * 0.0325;
            System.out.println("到期本息总额："+sum);
        }

        else if (year == 5) {
            sum = money + money * year * 0.036;
            System.out.println("到期本息总额："+sum);
        }

        else{
            System.out.println("Error.");
        }

    }
}

 */


/*
某商场购物可以打折，具体规则如下：

普通顾客购不满100元不打折，满100元打9折；
会员购物不满200元打8折，满200元打7.5折；
不同打折规则不累加计算。

请根据此优惠计划进行购物结算，键盘录入顾客的类别
（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），
输出应付金额（小数类型）。

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别：");
        int customer = sc.nextInt();
        System.out.println("请输入购物金额：");
        double money = sc.nextDouble();

        if (customer == 0) {
            if(money<100){
                System.out.println("应付金额："+money);
            }
            else{
                System.out.println("应付金额："+money*0.9);
            }
        }

        else if (customer == 1) {
            if(money<200){
                System.out.println("应付金额："+money*0.8);
            }
            else{
                System.out.println("应付金额："+money*0.75);
            }

        }

    }
}

 */

/*
模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
要求：
键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
请输入第一个整数: 30
请输入第二个整数: 40
请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
控制台输出:30+40=70

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数:");
        int n1 = sc.nextInt();

        System.out.println("请输入第二个整数:");
        int n2 = sc.nextInt();

        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int function = sc.nextInt();

        switch (function)
        {
            case 1://加法
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;
            case 2://减法
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            case 3://乘法
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            case 4://除法
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                break;
            default:
                System.out.println("Error.");
                break;
        }

    }
}

 */


/*
键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = n1 > n2 ? n1 : n2;
        int min = n1 < n2 ? n1 : n2;
        int sum = 0;

        for(int i = min; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

 */



/*
键盘录入两个数字，表示一个范围。
统计这个范围中。
 既能被3整除，又能被5整除数字有多少个？

import java.util.Scanner;

public class base01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = n1 > n2 ? n1 : n2;
        int min = n1 < n2 ? n1 : n2;
        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

 */


/*
世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?

public class base01 {
    public static void main(String[] args) {
        double paper = 0.1;
        double zhu = 8844430;
        int count = 0;
        while (paper <= zhu) {
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}

 */



/*
中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
请打印出1988年到2019年的所有闰年年份。

public class base01 {
    public static void main(String[] args) {
        for (int i = 1988; i <= 2019; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i + "是闰年");
            }
        }
    }
}

 */






