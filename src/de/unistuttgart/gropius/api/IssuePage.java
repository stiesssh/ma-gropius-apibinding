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
* A page of multiple issues
*/
public class IssuePage extends AbstractResponse<IssuePage> implements Page {
    public IssuePage() {
    }

    public IssuePage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "nodes": {
                    List<Issue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Issue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Issue optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Issue(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "edges": {
                    List<IssueEdge> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<IssueEdge> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            IssueEdge optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new IssueEdge(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

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

    public String getGraphQlTypeName() {
        return "IssuePage";
    }

    /**
    * All issues on this page
    */

    public List<Issue> getNodes() {
        return (List<Issue>) get("nodes");
    }

    public IssuePage setNodes(List<Issue> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    /**
    * Edges to all nodes containing the cursor
    */

    public List<IssueEdge> getEdges() {
        return (List<IssueEdge>) get("edges");
    }

    public IssuePage setEdges(List<IssueEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * Information about the current page (like length, first/last element)
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public IssuePage setPageInfo(PageInfo arg) {
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

    public IssuePage setTotalCount(Integer arg) {
        optimisticData.put(getKey("totalCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "nodes": return true;

            case "edges": return true;

            case "pageInfo": return true;

            case "totalCount": return false;

            default: return false;
        }
    }
}

