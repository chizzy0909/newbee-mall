
package ltd.newbee.mall.controller.mall;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import ltd.newbee.mall.service.PageInquiryService;
import ltd.newbee.mall.service.ReviewService;
import ltd.newbee.mall.util.PageInquiryUtil;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;

@Controller

public class ReviewController {

	@Resource
	ReviewService reviewService;

	/**
	 * 列表
	 */
	@RequestMapping(value = "/review/list", method = RequestMethod.GET)
	@ResponseBody
	public Result list(@RequestParam Map<String, Object> params) {

		if (StringUtils.isEmpty((String) params.get("currentPage")) || StringUtils.isEmpty((String) params.get("limit"))
				|| StringUtils.isEmpty((String) params.get("orderByColumn"))
				|| StringUtils.isEmpty((String) params.get("goodsId"))) {
			return ResultGenerator.genFailResult("参数异常！");
		}
		PageInquiryUtil pageUtil = new PageInquiryUtil(params);
		return ResultGenerator.genSuccessResult(reviewService.getReviewPage(pageUtil));
	}

}
