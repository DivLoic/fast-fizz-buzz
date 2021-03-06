package com.pubsap.eng.generator;

import com.typesafe.config.Config;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by loicmdivad.
 */
public class FizzUtils {

    public static Map<String, Object> mapFromConfig(Config config) {

        return config
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        pair -> config.getAnyRef(pair.getKey()))
                );
    }
}
