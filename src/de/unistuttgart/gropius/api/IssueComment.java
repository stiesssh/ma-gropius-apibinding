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
* A commemt on an issue. Not including th issue body itself
*/
public class IssueComment extends AbstractResponse<IssueComment> implements Comment, IssueTimelineItem, Node {
    public IssueComment() {
    }

    public IssueComment(JsonObject fields) throws SchemaViolationError {
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

                case "body": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bodyRendered": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "editedBy": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new User(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key)))));

                    break;
                }

                case "lastEditedAt": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentUserCanEdit": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "reactions": {
                    ReactionGroupPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroupPage(jsonAsObject(field.getValue(), key));
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

    public IssueComment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "IssueComment";
    }

    /**
    * The unique id of this comment
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The issue this comment belongs to
    */

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public IssueComment setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    /**
    * The body text of the comment.
    * Markdown supported.
    * Max. 65536 characters
    */

    public String getBody() {
        return (String) get("body");
    }

    public IssueComment setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The body text of the comment rendered to html
    */

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public IssueComment setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    /**
    * The user who originally created the comment (in ccims or any ims)
    */

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public IssueComment setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * A list of all people who edited the root of this comment (body and title)
    */

    public List<User> getEditedBy() {
        return (List<User>) get("editedBy");
    }

    public IssueComment setEditedBy(List<User> arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    /**
    * The date the comment was first created on
    */

    public Date getCreatedAt() {
        return (Date) get("createdAt");
    }

    public IssueComment setCreatedAt(Date arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Date when the core comment(title, body etc.) was last changed (comments and other events DO NOT
    * count)
    */

    public Date getLastEditedAt() {
        return (Date) get("lastEditedAt");
    }

    public IssueComment setLastEditedAt(Date arg) {
        optimisticData.put(getKey("lastEditedAt"), arg);
        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to edit this comment.
    * This only refers to editing the core comment (title, body, etc.)
    */

    public Boolean getCurrentUserCanEdit() {
        return (Boolean) get("currentUserCanEdit");
    }

    public IssueComment setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    /**
    * All reactions on this issue comment
    */

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public IssueComment setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "issue": return true;

            case "body": return false;

            case "bodyRendered": return false;

            case "createdBy": return true;

            case "editedBy": return true;

            case "createdAt": return false;

            case "lastEditedAt": return false;

            case "currentUserCanEdit": return false;

            case "reactions": return true;

            default: return false;
        }
    }
}

