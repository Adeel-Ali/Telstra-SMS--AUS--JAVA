/*
 * TelstraSMSAUSLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/01/2016
 */
package com.telstra.api.models;

import java.util.*;

public class SendMessageResponseBuilder {
    //the instance to build
    private SendMessageResponse sendMessageResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SendMessageResponseBuilder() {
        sendMessageResponse = new SendMessageResponse();
    }

    /**
     * The unique id to identity the message sent. 
     */
    public SendMessageResponseBuilder messageId(String messageId) {
        sendMessageResponse.setMessageId(messageId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendMessageResponse build() {
        return sendMessageResponse;
    }
}