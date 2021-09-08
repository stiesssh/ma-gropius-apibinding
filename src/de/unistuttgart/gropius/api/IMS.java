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
* An issue management system. This will be an __instance__ of one of the available IMS Types.
* E.g. One GitHub Repository's issue page.
*/
public class IMS extends AbstractResponse<IMS> implements Node {
    public IMS() {
    }

    public IMS(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "imsType": {
                    IMSType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = IMSType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "component": {
                    Component optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Component(jsonAsObject(field.getValue(), key));
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

    public IMS(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "IMS";
    }

    /**
    * The unique ID of this IMS
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The type/system this IMS is an instance of
    */

    public IMSType getImsType() {
        return (IMSType) get("imsType");
    }

    public IMS setImsType(IMSType arg) {
        optimisticData.put(getKey("imsType"), arg);
        return this;
    }

    /**
    * The component this IMS belongs to
    */

    public Component getComponent() {
        return (Component) get("component");
    }

    public IMS setComponent(Component arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "imsType": return false;

            case "component": return true;

            default: return false;
        }
    }
}

