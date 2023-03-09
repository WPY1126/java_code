//循环高级和数组---------------------------------------------------

/*
需求：定义一个数组，存储1,2,3,4,5
遍历数组得到每一个元素，求数组里面所有的数据和

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

 */


/*
需求：定义一个数组，存储1,2,3,4,5,6,7,8,9,10
 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

 */


/*
需求：求数组中的最大值
public class Main {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}

 */



/*
需求：生成10个1~100之间的随机数存入数组。
1）求出所有数据的和
2）求所有数据的平均数
3）统计有多少个数据比平均值小


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int avg = sum / arr.length;
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}

 */



/*
需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
交换前：1,2,3,4,5
交换后：5,2,3,4,1
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

 */



/*
需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rIndex = r.nextInt(arr.length);
            int t = arr[i];
            arr[i] = arr[rIndex];
            arr[rIndex] = t;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

 */



/*
需求：
键盘录入一个正整数 x ，判断该整数是否为一个质数。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int x = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(x + "是一个质数");
        } else {
            System.out.println(x + "不是一个质数");
        }


    }
}

 */


//方法（函数）----------------------------------------------------


/*
比较两个数大小并打印大的
public class Main {
    public static void main(String[] args) {
        int result = getMax(10,20);
        System.out.println(result);

    }

    public static int getMax(int a,int b){

        if(a>b){
            return a;
        }else{
            return b;
        }

    }

}

 */


/*数组最大值
public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 56, 98, 99, 66};
        int n = getMax(arr);
        System.out.println(n);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

 */










