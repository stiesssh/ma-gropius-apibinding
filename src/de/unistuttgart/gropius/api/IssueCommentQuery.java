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
* A commemt on an issue. Not including th issue body itself
*/
public class IssueCommentQuery extends Query<IssueCommentQuery> {
    IssueCommentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The issue this comment belongs to
    */
    public IssueCommentQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The body text of the comment.
    * Markdown supported.
    * Max. 65536 characters
    */
    public IssueCommentQuery body() {
        startField("body");

        return this;
    }

    /**
    * The body text of the comment rendered to html
    */
    public IssueCommentQuery bodyRendered() {
        startField("bodyRendered");

        return this;
    }

    /**
    * The user who originally created the comment (in ccims or any ims)
    */
    public IssueCommentQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of all people who edited the root of this comment (body and title)
    */
    public IssueCommentQuery editedBy(UserQueryDefinition queryDef) {
        startField("editedBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the comment was first created on
    */
    public IssueCommentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Date when the core comment(title, body etc.) was last changed (comments and other events DO NOT
    * count)
    */
    public IssueCommentQuery lastEditedAt() {
        startField("lastEditedAt");

        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to edit this comment.
    * This only refers to editing the core comment (title, body, etc.)
    */
    public IssueCommentQuery currentUserCanEdit() {
        startField("currentUserCanEdit");

        return this;
    }

    public class ReactionsArguments extends Arguments {
        ReactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only reactions AFTER one with the given cursor (exclusive)
        */
        public ReactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only reactions BEFORE the one with the given cursor (exclusive)
        */
        public ReactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only reactions matching this filter will be returned
        */
        public ReactionsArguments filterBy(ReactionGroupFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ reactions matching the filter
        */
        public ReactionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ reactions matching the filter
        */
        public ReactionsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReactionsArgumentsDefinition {
        void define(ReactionsArguments args);
    }

    /**
    * All reactions on this issue comment
    */
    public IssueCommentQuery reactions(ReactionGroupPageQueryDefinition queryDef) {
        return reactions(args -> {}, queryDef);
    }

    /**
    * All reactions on this issue comment
    */
    public IssueCommentQuery reactions(ReactionsArgumentsDefinition argsDef, ReactionGroupPageQueryDefinition queryDef) {
        startField("reactions");

        ReactionsArguments args = new ReactionsArguments(_queryBuilder);
        argsDef.define(args);
        ReactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReactionGroupPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
