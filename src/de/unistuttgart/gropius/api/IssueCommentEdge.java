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
* An edge for an IssueCommentPage to link a cursor to an element
*/
public class IssueCommentEdge extends AbstractResponse<IssueCommentEdge> {
    public IssueCommentEdge() {
    }

    public IssueCommentEdge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "node": {
                    IssueComment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueComment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cursor": {
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

    public String getGraphQlTypeName() {
        return "IssueCommentEdge";
    }

    /**
    * The issue comment linked to by this edge
    */

    public IssueComment getNode() {
        return (IssueComment) get("node");
    }

    public IssueCommentEdge setNode(IssueComment arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    /**
    * The cursor for use in the pagination
    */

    public String getCursor() {
        return (String) get("cursor");
    }

    public IssueCommentEdge setCursor(String arg) {
        optimisticData.put(getKey("cursor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "node": return true;

            case "cursor": return false;

            default: return false;
        }
    }
}

