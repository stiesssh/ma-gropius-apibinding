// Generated from graphql_java_gen gem

package de.unistuttgart.gropius.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.time.Instant;

import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalAccessor;

import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The Payload/Response for the pinIssue mutation
*/
public class PinIssuePayload extends AbstractResponse<PinIssuePayload> {
    public PinIssuePayload() {
    }

    public PinIssuePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "clientMutationID": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "component": {
                    Component optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Component(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    PinnedEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PinnedEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timelineEdge": {
                    IssueTimelineItemEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "PinIssuePayload";
    }

    /**
    * The string provided by the client on sending the mutation
    */

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public PinIssuePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    /**
    * The component the issue was pinned to
    */

    public Component getComponent() {
        return (Component) get("component");
    }

    public PinIssuePayload setComponent(Component arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    /**
    * The issue which removed from the location
    */

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public PinIssuePayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    /**
    * The issue timeline event for the pinnine of the issue to the component
    */

    public PinnedEvent getEvent() {
        return (PinnedEvent) get("event");
    }

    public PinIssuePayload setEvent(PinnedEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public PinIssuePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "component": return true;

            case "issue": return true;

            case "event": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

