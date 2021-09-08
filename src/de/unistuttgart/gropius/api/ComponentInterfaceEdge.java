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
* An edge for a ComponentInterfacePage to link a cursor to an element
*/
public class ComponentInterfaceEdge extends AbstractResponse<ComponentInterfaceEdge> {
    public ComponentInterfaceEdge() {
    }

    public ComponentInterfaceEdge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "node": {
                    ComponentInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentInterface(jsonAsObject(field.getValue(), key));
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
        return "ComponentInterfaceEdge";
    }

    /**
    * The interface linked to by this edge
    */

    public ComponentInterface getNode() {
        return (ComponentInterface) get("node");
    }

    public ComponentInterfaceEdge setNode(ComponentInterface arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    /**
    * The cursor for use in the pagination
    */

    public String getCursor() {
        return (String) get("cursor");
    }

    public ComponentInterfaceEdge setCursor(String arg) {
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

