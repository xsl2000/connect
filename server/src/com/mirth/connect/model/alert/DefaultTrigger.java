package com.mirth.connect.model.alert;

import java.util.Set;

import com.mirth.connect.donkey.model.event.ErrorEventType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("defaultTrigger")
public class DefaultTrigger extends ChannelTrigger implements AlertTrigger {

    private Set<ErrorEventType> errorEventTypes;
    private String regex;

    public DefaultTrigger(Set<ErrorEventType> errorAlertTypes, String regex) {
        this.errorEventTypes = errorAlertTypes;
        this.regex = regex;
    }

    public Set<ErrorEventType> getErrorEventTypes() {
        return errorEventTypes;
    }

    public void setErrorEventTypes(Set<ErrorEventType> errorEventTypes) {
        this.errorEventTypes = errorEventTypes;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

}