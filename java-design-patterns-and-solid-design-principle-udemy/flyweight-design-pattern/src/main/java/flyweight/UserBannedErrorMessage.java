package flyweight;

import java.time.Duration;

//Unshared concrete flyweight.
public class UserBannedErrorMessage implements ErrorMessage {
	//All state is defined here
	private String caseId;
	
	private String remarks;
	
	private Duration banDuration;
	
	private String msg;
	
	public UserBannedErrorMessage(String caseId) {
		//Load case info from DB.
		this.caseId = caseId;
		remarks = "You violated terms of use.";
		banDuration = Duration.ofDays(2);
		msg = "You are BANNED. Sorry. \nMore information:\n";
		msg += caseId +"\n";
		msg += remarks+"\n";
		msg += "Banned For:" +banDuration.toHours() + " Hours";
	}
	//We ignore the extrinsic state argument
	@Override
	public String getText(String code) {
		return msg;
	}

	public String getCaseNo() {
		return caseId;
	}
	
}
