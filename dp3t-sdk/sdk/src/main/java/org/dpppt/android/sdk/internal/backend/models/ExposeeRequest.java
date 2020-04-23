/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */

package org.dpppt.android.sdk.internal.backend.models;

import org.dpppt.android.sdk.internal.util.DayDate;

public class ExposeeRequest {

	private String key;
	private DayDate onset;
	private ExposeeAuthMethodJSON authData;

	public ExposeeRequest(String key, DayDate onset, ExposeeAuthMethodJSON authData) {
		this.key = key;
		this.onset = onset;
		this.authData = authData;
	}

	public String getKey() {
		return key;
	}

	public DayDate getOnset() {
		return onset;
	}

	public ExposeeAuthMethodJSON getAuthData() {
		return authData;
	}

}
