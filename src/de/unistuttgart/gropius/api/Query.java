// Generated from graphql_java_gen gem

package de.unistuttgart.gropius.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
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
* All queries for requesting stuff
*/
public class Query extends AbstractResponse<Query> {
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "node": {
                    Node optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownNode.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "echo": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "projects": {
                    ProjectPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProjectPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentUser": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkUsername": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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
        return "Query";
    }

    /**
    * Requests an object (node) using the given ID. If the given ID is invalid an error will be returned
    */

    public Node getNode() {
        return (Node) get("node");
    }

    public Query setNode(Node arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    /**
    * Returns the string which is given as input
    */

    public String getEcho() {
        return (String) get("echo");
    }

    public Query setEcho(String arg) {
        optimisticData.put(getKey("echo"), arg);
        return this;
    }

    /**
    * Requests all projects within the current ccims instance mathcing the `filterBy`
    */

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public Query setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    /**
    * Returns the user from which the PAI is currently being accessed
    */

    public User getCurrentUser() {
        return (User) get("currentUser");
    }

    public Query setCurrentUser(User arg) {
        optimisticData.put(getKey("currentUser"), arg);
        return this;
    }

    /**
    * Checks wether the given username is still available or already taken.
    * `true` is returned if the username is available and __NOT__ take
    * `false, if it __IS__ already taken and can't be used for a new user
    */

    public Boolean getCheckUsername() {
        return (Boolean) get("checkUsername");
    }

    public Query setCheckUsername(Boolean arg) {
        optimisticData.put(getKey("checkUsername"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "node": return false;

            case "echo": return false;

            case "projects": return true;

            case "currentUser": return true;

            case "checkUsername": return false;

            default: return false;
        }
    }
}

