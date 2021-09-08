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
* A page of elements
* Contains edges and nodes as well as some information and a node count
*/
public class UnknownPage extends AbstractResponse<UnknownPage> implements Page {
    public UnknownPage() {
    }

    public UnknownPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public static Page create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ComponentInterfacePage": {
                return new ComponentInterfacePage(fields);
            }

            case "ComponentPage": {
                return new ComponentPage(fields);
            }

            case "IssueCommentPage": {
                return new IssueCommentPage(fields);
            }

            case "IssueLocationPage": {
                return new IssueLocationPage(fields);
            }

            case "IssuePage": {
                return new IssuePage(fields);
            }

            case "IssueTimelineItemPage": {
                return new IssueTimelineItemPage(fields);
            }

            case "LabelPage": {
                return new LabelPage(fields);
            }

            case "ProjectPage": {
                return new ProjectPage(fields);
            }

            case "ReactionGroupPage": {
                return new ReactionGroupPage(fields);
            }

            case "UserPage": {
                return new UserPage(fields);
            }

            default: {
                return new UnknownPage(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * Information about the current page (like length, first/last element)
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public UnknownPage setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    /**
    * The total number of elements matching the filter
    * (Even ones that don't match the current page)
    */

    public Integer getTotalCount() {
        return (Integer) get("totalCount");
    }

    public UnknownPage setTotalCount(Integer arg) {
        optimisticData.put(getKey("totalCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "pageInfo": return true;

            case "totalCount": return false;

            default: return false;
        }
    }
}

