package xyz.chuxuezhe.order.lb;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author EugeneGe
 * @description
 * @date 2020-09-16 14:58
 */
public interface MyLoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
