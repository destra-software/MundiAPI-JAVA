/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateAutomaticAnticipationSettingsRequestBuilder {
    //the instance to build
    private CreateAutomaticAnticipationSettingsRequest createAutomaticAnticipationSettingsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAutomaticAnticipationSettingsRequestBuilder() {
        createAutomaticAnticipationSettingsRequest = new CreateAutomaticAnticipationSettingsRequest();
    }

    public CreateAutomaticAnticipationSettingsRequestBuilder enabled(boolean enabled) {
        createAutomaticAnticipationSettingsRequest.setEnabled(enabled);
        return this;
    }

    public CreateAutomaticAnticipationSettingsRequestBuilder type(String type) {
        createAutomaticAnticipationSettingsRequest.setType(type);
        return this;
    }

    public CreateAutomaticAnticipationSettingsRequestBuilder volumePercentage(int volumePercentage) {
        createAutomaticAnticipationSettingsRequest.setVolumePercentage(volumePercentage);
        return this;
    }

    public CreateAutomaticAnticipationSettingsRequestBuilder delay(int delay) {
        createAutomaticAnticipationSettingsRequest.setDelay(delay);
        return this;
    }

    public CreateAutomaticAnticipationSettingsRequestBuilder days(List<Integer> days) {
        createAutomaticAnticipationSettingsRequest.setDays(days);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAutomaticAnticipationSettingsRequest build() {
        return createAutomaticAnticipationSettingsRequest;
    }
}