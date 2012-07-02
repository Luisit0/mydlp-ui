package com.mydlp.ui.service.rdbms.proxy;

import org.springframework.stereotype.Service;

import com.mydlp.ui.domain.AbstractEntity;
import com.mydlp.ui.domain.RDBMSInformationTarget;

@Service("regularExpressionGroupEnumProxy")
public class RegularExpressionGroupEnumProxyImpl implements RDBMSObjectEnumProxy {

	@Override
	public Boolean isValid(RDBMSInformationTarget rdbmsInformationTarget,
			AbstractEntity entity, String rowReturnValue) {
		String str = rowReturnValue.trim();
		return str.length() > 3;
	}

	@Override
	public Boolean shouldStoreValue() {
		return true;
	}

	@Override
	public void truncate(RDBMSInformationTarget rdbmsInformationTarget,
			AbstractEntity entity) {
	}

	@Override
	public void delete(RDBMSInformationTarget rdbmsInformationTarget,
			AbstractEntity entity, String identifier) {
	}

	@Override
	public void save(RDBMSInformationTarget rdbmsInformationTarget,
			AbstractEntity entity, String identifier, String rowReturnValue) {
	}
	
	
}