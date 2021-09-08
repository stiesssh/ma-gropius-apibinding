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
* An ReferencedByIssueEvent in the timeline of an issue with a date and a creator
* This occurs if this issue is referenced by another known issue
*/
public class ReferencedByIssueEvent extends AbstractResponse<ReferencedByIssueEvent> implements IssueTimelineItem, Node {
    public ReferencedByIssueEvent() {
    }

    public ReferencedByIssueEvent(JsonObject fields) throws SchemaViolationError {
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

                case "mentionedAt": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mentionedInComment": {
                    IssueComment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueComment(jsonAsObject(field.getValue(), key));
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

    public ReferencedByIssueEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReferencedByIssueEvent";
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

    public ReferencedByIssueEvent setIssue(Issue arg) {
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

    public ReferencedByIssueEvent setCreatedBy(User arg) {
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

    public ReferencedByIssueEvent setCreatedAt(Date arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The issue by which this issue was referenced
    */

    public Issue getMentionedAt() {
        return (Issue) get("mentionedAt");
    }

    public ReferencedByIssueEvent setMentionedAt(Issue arg) {
        optimisticData.put(getKey("mentionedAt"), arg);
        return this;
    }

    /**
    * The comment in which the reference to this issue was made
    */

    public IssueComment getMentionedInComment() {
        return (IssueComment) get("mentionedInComment");
    }

    public ReferencedByIssueEvent setMentionedInComment(IssueComment arg) {
        optimisticData.put(getKey("mentionedInComment"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "issue": return true;

            case "createdBy": return true;

            case "createdAt": return false;

            case "mentionedAt": return true;

            case "mentionedInComment": return true;

            default: return false;
        }
    }
}

