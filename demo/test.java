package com.demo;


import com.test.User;

public class test {
   public static void main(String[] args) {
    User user=new User();
    user.setName("jack");
    user.setId(12);
    user.setDate("2017-1-23");
    System.out.println(user.toString());
   }
}
