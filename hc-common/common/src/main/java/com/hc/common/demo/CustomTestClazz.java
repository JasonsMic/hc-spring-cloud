package com.hc.common.demo;

import lombok.Data;

/**
 * @author Jason
 */
public final class CustomTestClazz {

    public static void main(String [] args){
        User user = new CustomTestClazz.User();
    }
    @Data
    static class User{
        private Integer id;
        private String name;
        private String password;
        private String slot;
    }

}
