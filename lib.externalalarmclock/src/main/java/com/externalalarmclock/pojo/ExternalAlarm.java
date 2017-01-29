package com.externalalarmclock.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ExternalAlarm {
	@JsonProperty
	private Date alarmTime;
	@JsonProperty
	private boolean vibrate;
	@JsonProperty
	private boolean wakeupLight;
	@JsonProperty
	private String ringTone;
	@JsonProperty
	private String audioStream;
	@JsonProperty
	private String message;

	public Date getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Date alarmTime) {
		this.alarmTime = alarmTime;
	}

	public boolean isVibrate() {
		return vibrate;
	}

	public void setVibrate(boolean vibrate) {
		this.vibrate = vibrate;
	}

	public boolean isWakeupLight() {
		return wakeupLight;
	}

	public void setWakeupLight(boolean wakeupLight) {
		this.wakeupLight = wakeupLight;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}

	public String getAudioStream() {
		return audioStream;
	}

	public void setAudioStream(String audioStream) {
		this.audioStream = audioStream;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
