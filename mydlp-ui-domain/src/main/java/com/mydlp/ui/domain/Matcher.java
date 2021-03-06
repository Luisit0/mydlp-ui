package com.mydlp.ui.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Matcher extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2049495725558730355L;

	protected String functionName;
	
	protected List<MatcherArgument> matcherArguments;
	
	protected InformationFeature coupledInformationFeature;

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName.trim();
	}

	@OneToMany(mappedBy="coupledMatcher", cascade={CascadeType.ALL})
	public List<MatcherArgument> getMatcherArguments() {
		return matcherArguments;
	}

	public void setMatcherArguments(List<MatcherArgument> matcherArguments) {
		this.matcherArguments = matcherArguments;
	}

	@OneToOne(mappedBy="matcher")
	public InformationFeature getCoupledInformationFeature() {
		return coupledInformationFeature;
	}

	public void setCoupledInformationFeature(
			InformationFeature coupledInformationFeature) {
		this.coupledInformationFeature = coupledInformationFeature;
	}

}
