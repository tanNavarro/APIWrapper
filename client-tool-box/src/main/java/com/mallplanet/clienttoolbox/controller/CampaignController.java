package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.CampaignRequest;
import com.mallplanet.clienttoolbox.response.CampaignAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class CampaignController {
	@Autowired
    private StickyFeetService stickyFeetService;
	
	@PostMapping("/campaignList")
    public CampaignAPIResponse customerSearch(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignList(campaignRequest);
    }
	
	@PostMapping("/inactiveCampaignList")
    public CampaignAPIResponse inactiveCampaignList(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.inactiveCampaignList(campaignRequest);
    }
	
	@PostMapping("/campaignRewardList")
    public CampaignAPIResponse campaignRewardList(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignRewardList(campaignRequest);
    }
	
	@PostMapping("/campaignPromoList")
    public CampaignAPIResponse campaignPromoList(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignPromoList(campaignRequest);
    }
	
	@PostMapping("/campaignDeapreciationList")
    public CampaignAPIResponse campaignDeapreciationList(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeapreciationList(campaignRequest);
    }
	
	@PostMapping("/campaignFeeList")
    public CampaignAPIResponse campaignFeeList(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignFeeList(campaignRequest);
    }
	
	@PostMapping("/campaignBuyXItemist")
    public CampaignAPIResponse campaignBuyXItemist(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignBuyXItemist(campaignRequest);
    }
	
	@PostMapping("/campaignDeactivate")
    public CampaignAPIResponse campaignDeactivate(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeactivate(campaignRequest);
    }
	
	@PostMapping("/campaignReactivate")
    public CampaignAPIResponse campaignReactivate(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignReactivate(campaignRequest);
    }
	
	@PostMapping("/campaignNew")
    public CampaignAPIResponse campaignNew(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNew(campaignRequest);
    }
	
	@PostMapping("/campaignNewReward")
    public CampaignAPIResponse campaignNewReward(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNewReward(campaignRequest);
    }
	
	@PostMapping("/campaignNewPromo")
    public CampaignAPIResponse campaignNewPromo(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNewPromo(campaignRequest);
    }
	
	@PostMapping("/campaignNewBuyXItem")
    public CampaignAPIResponse campaignNewBuyXItem(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNewBuyXItem(campaignRequest);
    }
	
	@PostMapping("/campaignNewDepreciation")
    public CampaignAPIResponse campaignNewDepreciation(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNewDepreciation(campaignRequest);
    }
	
	@PostMapping("/campaignNewFee")
    public CampaignAPIResponse campaignNewFee(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignNewFee(campaignRequest);
    }
	
	@PostMapping("/campaignUpdate")
    public CampaignAPIResponse campaignUpdate(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdate(campaignRequest);
    }
	
	@PostMapping("/campaignUpdateReward")
    public CampaignAPIResponse campaignUpdateReward(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdateReward(campaignRequest);
    }
	
	@PostMapping("/campaignUpdatePromo")
    public CampaignAPIResponse campaignUpdatePromo(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdatePromo(campaignRequest);
    }
	
	@PostMapping("/campaignUpdateBuyXItem")
    public CampaignAPIResponse campaignUpdateBuyXItem(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdateBuyXItem(campaignRequest);
    }
	
	@PostMapping("/campaignUpdateDepreciation")
    public CampaignAPIResponse campaignUpdateDepreciation(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdateDepreciation(campaignRequest);
    }
	
	@PostMapping("/campaignUpdateFee")
    public CampaignAPIResponse campaignUpdateFee(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignUpdateFee(campaignRequest);
    }
	
	@PostMapping("/campaignDelete")
    public CampaignAPIResponse campaignDelete(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDelete(campaignRequest);
    }
	
	@PostMapping("/campaignDeleteReward")
    public CampaignAPIResponse campaignDeleteReward(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeleteReward(campaignRequest);
    }
	
	@PostMapping("/campaignDeletePromo")
    public CampaignAPIResponse campaignDeletePromo(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeletePromo(campaignRequest);
    }
	
	@PostMapping("/campaignDeleteBuyXItem")
    public CampaignAPIResponse campaignDeleteBuyXItem(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeleteBuyXItem(campaignRequest);
    }
	
	@PostMapping("/campaignDeleteDepreciation")
    public CampaignAPIResponse campaignDeleteDepreciation(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeleteDepreciation(campaignRequest);
    }
	
	@PostMapping("/campaignDeleteFee")
    public CampaignAPIResponse campaignDeleteFee(@RequestBody CampaignRequest campaignRequest) throws IOException {
        return stickyFeetService.campaignDeleteFee(campaignRequest);
    }
}
