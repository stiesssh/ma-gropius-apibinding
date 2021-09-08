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
* A relation of users who have reacted with a certain reaction to something
*/
public class ReactionGroup extends AbstractResponse<ReactionGroup> implements Node {
    public ReactionGroup() {
    }

    public ReactionGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "users": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            User optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new User(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalUserCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "reaction": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public ReactionGroup(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReactionGroup";
    }

    /**
    * The unique id of this reaction group
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Users who reacted with this reaction.
    * If there are only a few, all users will be returned. If too many users are part of this reaction
    * group, only a few will be returned
    */

    public List<User> getUsers() {
        return (List<User>) get("users");
    }

    public ReactionGroup setUsers(List<User> arg) {
        optimisticData.put(getKey("users"), arg);
        return this;
    }

    /**
    * The total number of users in this reaction group.
    * This is needed in case the `users` list was truncated.
    */

    public Integer getTotalUserCount() {
        return (Integer) get("totalUserCount");
    }

    public ReactionGroup setTotalUserCount(Integer arg) {
        optimisticData.put(getKey("totalUserCount"), arg);
        return this;
    }

    /**
    * The name of the recation with which the people in this reaction group have reacted
    */

    public String getReaction() {
        return (String) get("reaction");
    }

    public ReactionGroup setReaction(String arg) {
        optimisticData.put(getKey("reaction"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "users": return true;

            case "totalUserCount": return false;

            case "reaction": return false;

            default: return false;
        }
    }
}

