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
* An interface specifying an editable text block (e.g. Issue, Comment)
*/
public class UnknownComment extends AbstractResponse<UnknownComment> implements Comment {
    public UnknownComment() {
    }

    public UnknownComment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static Comment create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Issue": {
                return new Issue(fields);
            }

            case "IssueComment": {
                return new IssueComment(fields);
            }

            default: {
                return new UnknownComment(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The unique id of this comment
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownComment setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
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

    public UnknownComment setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The body text of the comment rendered to html
    */

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public UnknownComment setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    /**
    * The user who originally created the comment (in ccims or any ims)
    */

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public UnknownComment setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * A list of all people who edited the root of this comment (body and title)
    */

    public List<User> getEditedBy() {
        return (List<User>) get("editedBy");
    }

    public UnknownComment setEditedBy(List<User> arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    /**
    * The date the comment was first created on
    */

    public Date getCreatedAt() {
        return (Date) get("createdAt");
    }

    public UnknownComment setCreatedAt(Date arg) {
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

    public UnknownComment setLastEditedAt(Date arg) {
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

    public UnknownComment setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    /**
    * All reactions that have been added to this comment
    */

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public UnknownComment setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

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

