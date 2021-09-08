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
* An interface offered by a component which can be counsumed by other components
*/
public class ComponentInterface extends AbstractResponse<ComponentInterface> implements IssueLocation, Node {
    public ComponentInterface() {
    }

    public ComponentInterface(JsonObject fields) throws SchemaViolationError {
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

                case "component": {
                    responseData.put(key, new Component(jsonAsObject(field.getValue(), key)));

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

                case "consumedBy": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
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

    public ComponentInterface(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ComponentInterface";
    }

    /**
    * The unique id of this component interface
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the component interface
    * Max. 256 characters
    */

    public String getName() {
        return (String) get("name");
    }

    public ComponentInterface setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A textual description (of the fuction) of this component interface .
    * Max. 65536 characters
    */

    public String getDescription() {
        return (String) get("description");
    }

    public ComponentInterface setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The parent component of this interface which offers it
    */

    public Component getComponent() {
        return (Component) get("component");
    }

    public ComponentInterface setComponent(Component arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    /**
    * All issues that are assigned to this component interface matching (if given) `filterBy`
    */

    public IssuePage getIssuesOnLocation() {
        return (IssuePage) get("issuesOnLocation");
    }

    public ComponentInterface setIssuesOnLocation(IssuePage arg) {
        optimisticData.put(getKey("issuesOnLocation"), arg);
        return this;
    }

    /**
    * Components which consume the interface and match the filter.
    * If no filter is given, all components will be returned
    */

    public ComponentPage getConsumedBy() {
        return (ComponentPage) get("consumedBy");
    }

    public ComponentInterface setConsumedBy(ComponentPage arg) {
        optimisticData.put(getKey("consumedBy"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "description": return false;

            case "component": return true;

            case "issuesOnLocation": return true;

            case "consumedBy": return true;

            default: return false;
        }
    }
}

