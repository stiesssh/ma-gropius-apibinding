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
* An EstimatedTimeChangedEvent in the timeline of an issue with a date and a creator
*/
public class EstimatedTimeChangedEvent extends AbstractResponse<EstimatedTimeChangedEvent> implements IssueTimelineItem, Node {
    public EstimatedTimeChangedEvent() {
    }

    public EstimatedTimeChangedEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issue": {
                    responseData.put(key, new Issue(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key)))));

                    break;
                }

                case "oldEstimatedTime": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "newEstimatedTime": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public EstimatedTimeChangedEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "EstimatedTimeChangedEvent";
    }

    /**
    * The unique id of this timeline item
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The issue this timeline event belongs to
    */

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public EstimatedTimeChangedEvent setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    /**
    * The user responsible for the creation of the event (e.g. autor of a comment)
    * It's possible there is no autor, for example if the action was performed automatically
    */

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public EstimatedTimeChangedEvent setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * The date the event occured on/was created.
    * This ISN'T updated if the event is be changed
    */

    public Date getCreatedAt() {
        return (Date) get("createdAt");
    }

    public EstimatedTimeChangedEvent setCreatedAt(Date arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The old time estimate for the issue
    */

    public Integer getOldEstimatedTime() {
        return (Integer) get("oldEstimatedTime");
    }

    public EstimatedTimeChangedEvent setOldEstimatedTime(Integer arg) {
        optimisticData.put(getKey("oldEstimatedTime"), arg);
        return this;
    }

    /**
    * The new updated time estimate for the issue
    */

    public Integer getNewEstimatedTime() {
        return (Integer) get("newEstimatedTime");
    }

    public EstimatedTimeChangedEvent setNewEstimatedTime(Integer arg) {
        optimisticData.put(getKey("newEstimatedTime"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "issue": return true;

            case "createdBy": return true;

            case "createdAt": return false;

            case "oldEstimatedTime": return false;

            case "newEstimatedTime": return false;

            default: return false;
        }
    }
}

