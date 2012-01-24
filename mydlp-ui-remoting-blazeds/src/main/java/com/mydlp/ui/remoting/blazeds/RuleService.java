package com.mydlp.ui.remoting.blazeds;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.mydlp.ui.domain.AuthSecurityRole;
import com.mydlp.ui.domain.Rule;
import com.mydlp.ui.domain.RuleItem;

@Secured(AuthSecurityRole.ROLE_USER)
public interface RuleService {

	public List<Rule> getRules();
	
	public Rule save(Rule rule);

	public void remove(Rule rule);
	
	public void removeRuleItem(RuleItem ruleItem);
	
	public void ruleUp(Rule r);
	
	public void ruleDown(Rule r);
	
	public void balanceRulePriority();
	
}