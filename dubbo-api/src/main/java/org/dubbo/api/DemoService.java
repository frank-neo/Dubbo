package org.dubbo.api;

import java.util.List;

public interface DemoService {
    List<String> getPermissions(Long id);
}
