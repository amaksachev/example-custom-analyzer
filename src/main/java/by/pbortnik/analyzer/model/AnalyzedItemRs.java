/*
 * Copyright 2017 EPAM Systems
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package by.pbortnik.analyzer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pavel Bortnik
 */
public class AnalyzedItemRs implements Comparable<AnalyzedItemRs> {

	@JsonProperty("test_item")
	private String itemId;

	@JsonProperty("relevant_item")
	private String relevantItemId;

	@JsonProperty("issue_type")
	private String issueType;

	@Override
	public int compareTo(AnalyzedItemRs o) {
		return itemId.compareTo(o.getItemId());
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRelevantItemId() {
		return relevantItemId;
	}

	public void setRelevantItemId(String relevantItemId) {
		this.relevantItemId = relevantItemId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
}
