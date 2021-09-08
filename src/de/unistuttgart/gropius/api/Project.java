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
* A project is a one unit in which the participating components colaborate
*/
public class Project extends AbstractResponse<Project> implements Node {
    public Project() {
    }

    public Project(JsonObject fields) throws SchemaViolationError {
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

                case "components": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "users": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "owner": {
                    responseData.put(key, new User(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "issues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "labels": {
                    LabelPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LabelPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public Project(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Project";
    }

    /**
    * The unique id of this project
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The human readable name of this project
    * Max. 256 characters
    */

    public String getName() {
        return (String) get("name");
    }

    public Project setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * All compomponents which are a part of this project and match (if given) `filterBy`
    */

    public ComponentPage getComponents() {
        return (ComponentPage) get("components");
    }

    public Project setComponents(ComponentPage arg) {
        optimisticData.put(getKey("components"), arg);
        return this;
    }

    /**
    * All users that participate in this project and (if given)match `filterBy`
    */

    public UserPage getUsers() {
        return (UserPage) get("users");
    }

    public Project setUsers(UserPage arg) {
        optimisticData.put(getKey("users"), arg);
        return this;
    }

    /**
    * The user who administrates "owns" the project
    */

    public User getOwner() {
        return (User) get("owner");
    }

    public Project setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * All issues on components that are assigned to this project
    */

    public IssuePage getIssues() {
        return (IssuePage) get("issues");
    }

    public Project setIssues(IssuePage arg) {
        optimisticData.put(getKey("issues"), arg);
        return this;
    }

    /**
    * All labels which are available on this project, matching the given filter.
    * If no filter is given, all labels will be returned
    */

    public LabelPage getLabels() {
        return (LabelPage) get("labels");
    }

    public Project setLabels(LabelPage arg) {
        optimisticData.put(getKey("labels"), arg);
        return this;
    }

    /**
    * A textual description of this project.
    * Max. 65536 characters
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Project setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "components": return true;

            case "users": return true;

            case "owner": return true;

            case "issues": return true;

            case "labels": return true;

            case "description": return false;

            default: return false;
        }
    }
}

