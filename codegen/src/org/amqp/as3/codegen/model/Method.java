package org.amqp.as3.codegen.model;

import java.util.List;

public class Method {

    private String name;

    private int index;

    private AMQPClass amqpClass;

    private boolean hasContent = false;

    private boolean hasResponse = false;

    private boolean hasAltResponse = false;

    private boolean bottomHalf = false;

    private boolean synchronous;

    private List<Field> fields;

    private Method response;

    public boolean isBottomHalf() {
        return bottomHalf;
    }

    public void setBottomHalf(boolean bottomHalf) {
        this.bottomHalf = bottomHalf;
    }

    public boolean isHasAltResponse() {
        return hasAltResponse;
    }

    public void setHasAltResponse(boolean hasAltResponse) {
        this.hasAltResponse = hasAltResponse;
    }

    public boolean isHasResponse() {
        return hasResponse;
    }

    public boolean renderResponse() {
        return response != null && synchronous;
    }

    public boolean isHasContent() {
        return hasContent;
    }

    public void setHasContent(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public AMQPClass getAmqpClass() {
        return amqpClass;
    }

    public void setAmqpClass(AMQPClass amqpClass) {
        this.amqpClass = amqpClass;
    }

    public Method getResponse() {
        return response;
    }

    public void setResponse(Method response) {
        if (null != response) hasResponse = true;
        this.response = response;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSynchronous() {
        return synchronous;
    }

    public void setSynchronous(boolean synchronous) {
        this.synchronous = synchronous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
