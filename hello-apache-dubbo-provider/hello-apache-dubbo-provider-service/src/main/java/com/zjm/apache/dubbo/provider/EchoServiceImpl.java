package com.zjm.apache.dubbo.provider;

import com.zjm.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "hello dubbo: "+string;
    }
}
