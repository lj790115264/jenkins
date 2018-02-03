package com.chinacaring.peixian.patient.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ListUtils<T> {

    private List<T> list;

    public ListUtils(List<T> list) {
        this.list = list;
    }

    public Map<String, List<T>> groupBy(Class dtoClass, String... groupName) {

        Map<String, List<T>> map = new LinkedHashMap<String, List<T>>();

        for (T t: list) {

            /**
             * 获得所有传入的get方法获取的值，拼接起来获得groupby的唯一标识
             */
            String primary = Arrays.stream(groupName).reduce("", (acc, key) -> {

                String value = "";
                try {

                    Method method = dtoClass.getMethod(key, null);
                    value = (String) method.invoke(t, null);
                    if (null == value) {
                        value = "";
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } finally {
                    return acc + value;
                }
            });

            List<T> mapList = map.get(primary);
            if (null == mapList) {
                mapList = new ArrayList<T>();
            }
            mapList.add(t);
            map.put(primary, mapList);
        }

        return map;
    }
}
