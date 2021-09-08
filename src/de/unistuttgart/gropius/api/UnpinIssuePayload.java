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
* The Payload/Response for the unpinIssue mutation
*/
public class UnpinIssuePayload extends AbstractResponse<UnpinIssuePayload> {
    public UnpinIssuePayload() {
    }

    public UnpinIssuePayload(JsonObject fields) throws SchemaViolationError {
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

                case "issue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "component": {
                    Comment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownComment.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    UnpinnedEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnpinnedEvent(jsonAsObject(field.getValue(), key));
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
        return "UnpinIssuePayload";
    }

    /**
    * The string provided by the client on sending the mutation
    */

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public UnpinIssuePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    /**
    * The issue which was unpinned by the performed mutation
    */

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public UnpinIssuePayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    /**
    * The component the issue was unpinned from
    */

    public Comment getComponent() {
        return (Comment) get("component");
    }

    public UnpinIssuePayload setComponent(Comment arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    /**
    * The issue timeline event for the unpinning of the issue
    */

    public UnpinnedEvent getEvent() {
        return (UnpinnedEvent) get("event");
    }

    public UnpinIssuePayload setEvent(UnpinnedEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public UnpinIssuePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "issue": return true;

            case "component": return false;

            case "event": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

