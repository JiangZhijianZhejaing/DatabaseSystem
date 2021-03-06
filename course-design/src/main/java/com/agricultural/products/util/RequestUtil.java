package com.agricultural.products.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/22:46
 */
// 对HttpRequest进行预处理
public class RequestUtil {
    public static int getInt(HttpServletRequest request, String key)
    {
        try
        {
            return Integer.decode(request.getParameter(key));
        } catch (Exception e)
        {
            return -1;
        }
    }

    public static int getInt(String key)
    {
        try
        {
            return Integer.decode(key);
        } catch (Exception e)
        {
            return -1;
        }
    }

    public static long getLong(HttpServletRequest request, String key)
    {
        try
        {
            return Long.decode(request.getParameter(key));
        } catch (Exception e)
        {
            return -1;
        }
    }

    public static Double getDouble(HttpServletRequest request, String key)
    {
        try
        {
            return Double.valueOf(request.getParameter(key));
        } catch (Exception e)
        {
            return -1.0;
        }
    }

    public static boolean getBoolean(HttpServletRequest request, String key)
    {
        try
        {
            return Boolean.valueOf(request.getParameter(key));
        } catch (Exception e)
        {
            return false;
        }
    }

    public static String getString(HttpServletRequest request, String key)
    {
        try
        {
            String result = request.getParameter(key);
            if (result != null)
            {
                result = result.trim();
            }
            if ("".equals(result))
            {
                result = null;
            }
            return result;
        } catch (Exception e)
        {
            return null;
        }
    }


    public static String getMapString(String mapKey)
    {
        try
        {
            if (mapKey != null)
            {
                mapKey = mapKey.trim();
            }
            if ("".equals(mapKey))
            {
                mapKey = null;
            }
            return mapKey;
        } catch (Exception e)
        {
            return null;
        }
    }
}
