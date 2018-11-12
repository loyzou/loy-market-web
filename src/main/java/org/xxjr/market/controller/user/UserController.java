package org.xxjr.market.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.ddq.common.context.AppResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comm/")
public class UserController {
	@RequestMapping("login")
	@ResponseBody
	public AppResult login(HttpServletRequest request){
		AppResult result  = new AppResult();
		result.putAttr("test", "loy");
		return result;
	}

}
