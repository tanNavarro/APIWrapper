package com.mallplanet.clienttoolbox.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Campaign {
	private String id;
	private String name;
	private String description;
	private String type;
	private String balance;
	private String cumulative;
	@SerializedName("balance_coalition")
	private String balanceCoalition;
	@SerializedName("cumulative_coalition")
	private String cumulativeCoalition;
	@SerializedName("monetary_balance")
	private String monetaryBalance;
	private String currency;
	private String glyph;
	@SerializedName("last_transaction")
	private String lastTransaction;
	@SerializedName("first_transaction")
	private String firstTransaction;	
	@SerializedName("in_coalition")
	private String inCoalition;
	@SerializedName("created_stamp")
	private String createdStamp;
	@SerializedName("opt_out")
	private String optOut;
	@SerializedName("optout_capable")
	private String optoutCapable;
	@SerializedName("pointsRatio")
	private String pointsRatio;
	@SerializedName("reward_ratio")
	private String rewardRatio;	
	private Reward reward;
	private Promotion promo;
	private Item item;
	private Depreciation depreciation;
	private Fee fee;
	private List<Item> balances;
	@SerializedName("available_rewards")
	private List<Reward> availableRewards;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCumulative() {
		return cumulative;
	}
	public void setCumulative(String cumulative) {
		this.cumulative = cumulative;
	}
	public String getBalanceCoalition() {
		return balanceCoalition;
	}
	public void setBalanceCoalition(String balanceCoalition) {
		this.balanceCoalition = balanceCoalition;
	}
	public String getCumulativeCoalition() {
		return cumulativeCoalition;
	}
	public void setCumulativeCoalition(String cumulativeCoalition) {
		this.cumulativeCoalition = cumulativeCoalition;
	}
	public String getMonetaryBalance() {
		return monetaryBalance;
	}
	public void setMonetaryBalance(String monetaryBalance) {
		this.monetaryBalance = monetaryBalance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getGlyph() {
		return glyph;
	}
	public void setGlyph(String glyph) {
		this.glyph = glyph;
	}
	public String getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(String lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	public String getFirstTransaction() {
		return firstTransaction;
	}
	public void setFirstTransaction(String firstTransaction) {
		this.firstTransaction = firstTransaction;
	}
	public String getInCoalition() {
		return inCoalition;
	}
	public void setInCoalition(String inCoalition) {
		this.inCoalition = inCoalition;
	}
	public String getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(String createdStamp) {
		this.createdStamp = createdStamp;
	}
	public String getOptOut() {
		return optOut;
	}
	public void setOptOut(String optOut) {
		this.optOut = optOut;
	}
	public String getOptoutCapable() {
		return optoutCapable;
	}
	public void setOptoutCapable(String optoutCapable) {
		this.optoutCapable = optoutCapable;
	}
	public String getPointsRatio() {
		return pointsRatio;
	}
	public void setPointsRatio(String pointsRatio) {
		this.pointsRatio = pointsRatio;
	}
	public String getRewardRatio() {
		return rewardRatio;
	}
	public void setRewardRatio(String rewardRatio) {
		this.rewardRatio = rewardRatio;
	}
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	public Promotion getPromo() {
		return promo;
	}
	public void setPromo(Promotion promo) {
		this.promo = promo;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Depreciation getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(Depreciation depreciation) {
		this.depreciation = depreciation;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public List<Item> getBalances() {
		return balances;
	}
	public void setBalances(List<Item> balances) {
		this.balances = balances;
	}
	public List<Reward> getAvailableRewards() {
		return availableRewards;
	}
	public void setAvailableRewards(List<Reward> availableRewards) {
		this.availableRewards = availableRewards;
	}
}
