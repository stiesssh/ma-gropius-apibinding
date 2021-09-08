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
public class PageQuery extends Query<PageQuery> {
    PageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * Information about the current page (like length, first/last element)
    */
    public PageQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of elements matching the filter
    * (Even ones that don't match the current page)
    */
    public PageQuery totalCount() {
        startField("totalCount");

        return this;
    }

    public PageQuery onComponentInterfacePage(ComponentInterfacePageQueryDefinition queryDef) {
        startInlineFragment("ComponentInterfacePage");
        queryDef.define(new ComponentInterfacePageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onComponentPage(ComponentPageQueryDefinition queryDef) {
        startInlineFragment("ComponentPage");
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssueCommentPage(IssueCommentPageQueryDefinition queryDef) {
        startInlineFragment("IssueCommentPage");
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssueLocationPage(IssueLocationPageQueryDefinition queryDef) {
        startInlineFragment("IssueLocationPage");
        queryDef.define(new IssueLocationPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssuePage(IssuePageQueryDefinition queryDef) {
        startInlineFragment("IssuePage");
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssueTimelineItemPage(IssueTimelineItemPageQueryDefinition queryDef) {
        startInlineFragment("IssueTimelineItemPage");
        queryDef.define(new IssueTimelineItemPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onLabelPage(LabelPageQueryDefinition queryDef) {
        startInlineFragment("LabelPage");
        queryDef.define(new LabelPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onProjectPage(ProjectPageQueryDefinition queryDef) {
        startInlineFragment("ProjectPage");
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onReactionGroupPage(ReactionGroupPageQueryDefinition queryDef) {
        startInlineFragment("ReactionGroupPage");
        queryDef.define(new ReactionGroupPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onUserPage(UserPageQueryDefinition queryDef) {
        startInlineFragment("UserPage");
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
