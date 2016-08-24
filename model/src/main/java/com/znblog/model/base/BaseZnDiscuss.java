package com.znblog.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZnDiscuss<M extends BaseZnDiscuss<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setDiscussReportId(java.lang.Integer discussReportId) {
		set("discuss_report_id", discussReportId);
	}

	public java.lang.Integer getDiscussReportId() {
		return get("discuss_report_id");
	}

	public void setDiscussCritic(java.lang.String discussCritic) {
		set("discuss_critic", discussCritic);
	}

	public java.lang.String getDiscussCritic() {
		return get("discuss_critic");
	}

	public void setDiscussReply(java.lang.String discussReply) {
		set("discuss_reply", discussReply);
	}

	public java.lang.String getDiscussReply() {
		return get("discuss_reply");
	}

	public void setDiscussMessage(java.lang.String discussMessage) {
		set("discuss_message", discussMessage);
	}

	public java.lang.String getDiscussMessage() {
		return get("discuss_message");
	}

	public void setDiscussTime(java.util.Date discussTime) {
		set("discuss_time", discussTime);
	}

	public java.util.Date getDiscussTime() {
		return get("discuss_time");
	}

}
