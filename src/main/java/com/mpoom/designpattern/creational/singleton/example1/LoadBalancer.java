package com.mpoom.designpattern.creational.singleton.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description 负载均衡器
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class LoadBalancer {
    private static LoadBalancer instance;
    private List serverList;

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getInstance() {
        if(instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
