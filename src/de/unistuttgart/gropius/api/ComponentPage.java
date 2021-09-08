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
* A page of multiple components
*/
public class ComponentPage extends AbstractResponse<ComponentPage> implements Page {
    public ComponentPage() {
    }

    public ComponentPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "nodes": {
                    List<Component> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Component> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Component optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Component(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "edges": {
                    List<ComponentEdge> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ComponentEdge> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ComponentEdge optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ComponentEdge(jsonAsObject(element1, key));
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
        return "ComponentPage";
    }

    /**
    * All components on this page
    */

    public List<Component> getNodes() {
        return (List<Component>) get("nodes");
    }

    public ComponentPage setNodes(List<Component> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    /**
    * Edges to all nodes containing the cursor
    */

    public List<ComponentEdge> getEdges() {
        return (List<ComponentEdge>) get("edges");
    }

    public ComponentPage setEdges(List<ComponentEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * Information about the current page (like length, first/last element)
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public ComponentPage setPageInfo(PageInfo arg) {
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

    public ComponentPage setTotalCount(Integer arg) {
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

