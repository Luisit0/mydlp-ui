package com.mydlp.ui.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DocumentDatabase extends Argument {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3670016092569543643L;
	
	protected List<DocumentDatabaseFileEntry> fileEntries;
	protected RDBMSInformationTarget rdbmsInformationTarget;

	@OneToMany(cascade={CascadeType.ALL})
	public List<DocumentDatabaseFileEntry> getFileEntries() {
		return fileEntries;
	}

	public void setFileEntries(List<DocumentDatabaseFileEntry> fileEntries) {
		this.fileEntries = fileEntries;
	}

	@OneToOne(cascade={CascadeType.ALL})
	public RDBMSInformationTarget getRdbmsInformationTarget() {
		return rdbmsInformationTarget;
	}

	public void setRdbmsInformationTarget(
			RDBMSInformationTarget rdbmsInformationTarget) {
		this.rdbmsInformationTarget = rdbmsInformationTarget;
	}

}
