package com.amitpamecha.protectionproxy.demo;

public class TestProtectionProxy {

    public static void main(String[] args) {

        // If we give correct userName and password
        User user = new User("admin", "admin");
        FolderProxy folderProxy = new FolderProxy(user);
        System.out.println("When userName and password are correct:");
        folderProxy.performOperations();
        System.out.println("**************************************");
       
        // if we give wrong userName and Password
        User userWrong = new User("abc", "abc");
        FolderProxy folderProxyWrong = new FolderProxy(userWrong);
        System.out.println("When userName and password are incorrect:");
        folderProxyWrong.performOperations();
    }

}
