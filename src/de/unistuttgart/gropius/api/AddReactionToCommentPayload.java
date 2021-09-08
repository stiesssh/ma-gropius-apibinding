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
* The Payload/Response for the addToCommentReaction mutation
*/
public class AddReactionToCommentPayload extends AbstractResponse<AddReactionToCommentPayload> {
    public AddReactionToCommentPayload() {
    }

    public AddReactionToCommentPayload(JsonObject fields) throws SchemaViolationError {
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

                case "comment": {
                    Comment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownComment.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reaction": {
                    ReactionGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroup(jsonAsObject(field.getValue(), key));
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
        return "AddReactionToCommentPayload";
    }

    /**
    * The string provided by the client on sending the mutation
    */

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public AddReactionToCommentPayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    /**
    * The comment the reaction was added to
    */

    public Comment getComment() {
        return (Comment) get("comment");
    }

    public AddReactionToCommentPayload setComment(Comment arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    * The group of users that all reacted to this comment with the same reaction
    */

    public ReactionGroup getReaction() {
        return (ReactionGroup) get("reaction");
    }

    public AddReactionToCommentPayload setReaction(ReactionGroup arg) {
        optimisticData.put(getKey("reaction"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "comment": return false;

            case "reaction": return true;

            default: return false;
        }
    }
}

