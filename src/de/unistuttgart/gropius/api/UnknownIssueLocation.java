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
* A location an issue can be assigned to
* Currently this can be either a component or an interface
*/
public class UnknownIssueLocation extends AbstractResponse<UnknownIssueLocation> implements IssueLocation {
    public UnknownIssueLocation() {
    }

    public UnknownIssueLocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issuesOnLocation": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
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

    public static IssueLocation create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Component": {
                return new Component(fields);
            }

            case "ComponentInterface": {
                return new ComponentInterface(fields);
            }

            default: {
                return new UnknownIssueLocation(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The unique id of the node of this location
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownIssueLocation setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The name of the location
    * Max. 256 characters
    */

    public String getName() {
        return (String) get("name");
    }

    public UnknownIssueLocation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A textual description (of the fuction) of this issue location.
    * Max. 65536 characters
    */

    public String getDescription() {
        return (String) get("description");
    }

    public UnknownIssueLocation setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * All issues that are assinged to on this issue location matching (if given) `filterBy`
    */

    public IssuePage getIssuesOnLocation() {
        return (IssuePage) get("issuesOnLocation");
    }

    public UnknownIssueLocation setIssuesOnLocation(IssuePage arg) {
        optimisticData.put(getKey("issuesOnLocation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "description": return false;

            case "issuesOnLocation": return true;

            default: return false;
        }
    }
}

