package com.bridgeit.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor
{
    private static final long serialVersionUID = 1L;
 
   
    public void destroy() {
        System.out.println("Interceptor destroy() is called...");
    }
 
  
    public void init() {
        System.out.println("Interceptor init() is called...");
    }
 
   
    public String intercept(ActionInvocation invocation) throws Exception
    {
        System.out.println("Interceptor intercept() is called...");
        System.out.println(invocation.getAction().getClass().getName());
        return invocation.invoke();
    }
}
