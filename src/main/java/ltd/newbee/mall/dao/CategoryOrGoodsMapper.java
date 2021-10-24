package ltd.newbee.mall.dao;

import java.util.ArrayList;

import ltd.newbee.mall.entity.ApplyCategoryCampaign;
import ltd.newbee.mall.entity.ApplyGoodsCampaign;


public interface CategoryOrGoodsMapper {

	
	ArrayList<ApplyCategoryCampaign> getApplyCategory(ApplyCategoryCampaign applyCategoryCampaign);
	
	ArrayList<ApplyGoodsCampaign> getApplyGoods(ApplyGoodsCampaign applyGoodsCampaign);

}
