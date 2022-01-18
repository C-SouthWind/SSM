package com.chj.config;

import com.chj.result.Result;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import com.chj.utils.JacksonUtils;

@Component
public class ExceptionHandling implements HandlerExceptionResolver {
    @SneakyThrows
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        Result result = new Result(400, "异常", null);
        PrintWriter writer = response.getWriter();
        writer.print(JacksonUtils.obj2json(result));
        return new ModelAndView();
    }
}
