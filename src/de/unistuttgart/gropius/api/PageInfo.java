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
* Information about a page including the first and last elements cursor and next/previous pages
*/
public class PageInfo extends AbstractResponse<PageInfo> {
    public PageInfo() {
    }

    public PageInfo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "startCursor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "endCursor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasNextPage": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "hasPreviousPage": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "PageInfo";
    }

    /**
    * The cursor of the first element on the page. Can be used to request the previous page.
    */

    public String getStartCursor() {
        return (String) get("startCursor");
    }

    public PageInfo setStartCursor(String arg) {
        optimisticData.put(getKey("startCursor"), arg);
        return this;
    }

    /**
    * The cursor of the last element on the page. Can be used to request the next page.
    */

    public String getEndCursor() {
        return (String) get("endCursor");
    }

    public PageInfo setEndCursor(String arg) {
        optimisticData.put(getKey("endCursor"), arg);
        return this;
    }

    /**
    * true iff there is another page of elements with the current filter
    */

    public Boolean getHasNextPage() {
        return (Boolean) get("hasNextPage");
    }

    public PageInfo setHasNextPage(Boolean arg) {
        optimisticData.put(getKey("hasNextPage"), arg);
        return this;
    }

    /**
    * true iff there is a previous page of elements with the current filter
    */

    public Boolean getHasPreviousPage() {
        return (Boolean) get("hasPreviousPage");
    }

    public PageInfo setHasPreviousPage(Boolean arg) {
        optimisticData.put(getKey("hasPreviousPage"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "startCursor": return false;

            case "endCursor": return false;

            case "hasNextPage": return false;

            case "hasPreviousPage": return false;

            default: return false;
        }
    }
}

