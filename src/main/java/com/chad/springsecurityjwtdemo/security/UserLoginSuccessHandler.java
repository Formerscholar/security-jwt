package com.chad.springsecurityjwtdemo.security;

import com.chad.springsecurityjwtdemo.config.JWTConfig;
import com.chad.springsecurityjwtdemo.util.JWTTokenUtil;
import com.chad.springsecurityjwtdemo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
	                                    Authentication authentication) throws IOException, ServletException {
		// 组装JWT
		SelfUserEntity selfUserEntity = (SelfUserEntity) authentication.getPrincipal();
		String token = JWTTokenUtil.createAccessToken(selfUserEntity);
		token = JWTConfig.tokenPrefix + token;
		// 封装返回参数
		Map<String, Object> resultData = new HashMap<>();
		resultData.put("code", "200");
		resultData.put("msg", "登录成功");
		resultData.put("token", token);
		ResultUtil.responseJson(httpServletResponse, resultData);
		
	}
}
