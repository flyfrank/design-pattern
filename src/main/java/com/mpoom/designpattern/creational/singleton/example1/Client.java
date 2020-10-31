package com.mpoom.designpattern.creational.singleton.example1;

import java.util.stream.IntStream;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1 = LoadBalancer.getInstance();
        LoadBalancer balancer2 = LoadBalancer.getInstance();
        LoadBalancer balancer3 = LoadBalancer.getInstance();
        LoadBalancer balancer4 = LoadBalancer.getInstance();

        if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        IntStream.range(0, 10).forEach(index -> {
            System.out.println("分发请求至服务器：" + balancer1.getServer());
        });
    }

}
