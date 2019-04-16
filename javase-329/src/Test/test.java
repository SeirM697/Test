package Test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str = "2101010";
        char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 2;i < len;i++){
            if(arr[i] != arr[i-1]){
                char[] newArr = new char[arr.length - 2 ];
                for (int j = 0 ; j < i-1;j++){
                    newArr[j] = arr[i-1-1];
                }
                len = newArr.length;
                for (int k = arr.length-1; k > i;k--){
                    newArr[len-1] = arr[k];
                    len = len - 1;
                }
                for (int p = 0; p < newArr.length;p++){
                    arr[p] = newArr[p];
                }
                System.out.println(Arrays.toString(newArr));
                System.out.println(arr);

            }
        }
    }
}
