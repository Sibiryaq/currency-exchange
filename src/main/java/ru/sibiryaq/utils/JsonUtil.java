package ru.sibiryaq.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonUtil {
    private JsonUtil() {
    }

    public static void sendJson(HttpServletResponse resp, int status, JSONObject obj) throws IOException {
        resp.setStatus(status);
        resp.setContentType("application/json; charset=utf-8");
        try (PrintWriter w = resp.getWriter()) {
            w.print(obj.toString());
        }
    }

    public static void sendJson(HttpServletResponse resp, int status, JSONArray arr) throws IOException {
        resp.setStatus(status);
        resp.setContentType("application/json; charset=utf-8");
        try (PrintWriter w = resp.getWriter()) {
            w.print(arr.toString());
        }
    }

    public static void sendError(HttpServletResponse resp, int status, String message) throws IOException {
        JSONObject o = new JSONObject();
        o.put("message", message);
        sendJson(resp, status, o);
    }
}
