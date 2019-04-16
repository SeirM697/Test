package JcfTest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        //面向接口编程
//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(6);
//        list1.add(7);
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        list.add(2, 4);
//        list.addAll(list1);
////        System.out.println(list);
//        List<String> vector = new Vector<>();
//        vector.add("a");
//        vector.add("b");
//        vector.add("b");
//        vector.remove(2);
//
//        System.out.println(vector);
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "java");
//        map.put(2, "c++");
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map);
//        System.out.println(map.size());
//        for (Integer key:map.keySet()
//             ) {
//            System.out.printf("%d = %s \n",key,map.get(key));
//        }
//        Stack<String> stack = new Stack<>();
//        stack.push("a");
//        stack.push("b");
//        stack.push("c");
//        stack.push("d");
//        stack.push("e");
//        System.out.println(stack.peek());
        Queue<Integer> queue = new LinkedList<>();6
        ((LinkedList<Integer>) queue).add(1);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
