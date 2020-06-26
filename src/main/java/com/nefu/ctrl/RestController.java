package com.nefu.ctrl;
import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.nefu.entity.R;

@Controller
@ResponseBody
@RequestMapping("/api")
public class RestController {

	@RequestMapping("/")
	public R apiAccess() {
		return new R(R.SUCCESS, R.SUCCESS_MSG, "接口调用成功");
	}
}
