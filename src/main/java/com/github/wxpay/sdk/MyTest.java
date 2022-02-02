package com.github.wxpay.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author huangbc
 */
public class MyTest {
    private static class Person{
        int idCard;
        String name;

        public Person(int idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (o == null || getClass() != o.getClass()){
//                return false;
//            }
//            Person person = (Person) o;
//            //两个对象是否等值，通过idCard来确定
//            return this.idCard == person.idCard;
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            if (idCard != person.idCard) return false;
            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            int result = idCard;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    public static void main(String []args){
        HashMap<Person,String> map = new HashMap<Person, String>();
        Person person = new Person(1234,"乔峰");
        //put到hashmap中去
        System.out.println(person.hashCode());
        map.put(person,"天龙八部");
        map.put(new Person(1234,"乔峰"),"天龙八部");

        //get取出，从逻辑上讲应该能输出“天龙八部”
        System.out.println(new Person(1234, "乔峰").hashCode());
        System.out.println("结果:"+map.get(new Person(1234,"乔峰")));

        System.out.println(person.equals(new Person(1234, "萧峰")));
        System.out.println(map.size());
    }

//    683658
//    683658
//    结果:天龙八部
//    true

/*    859417998
      5592464
      结果:null
      false*/
}
