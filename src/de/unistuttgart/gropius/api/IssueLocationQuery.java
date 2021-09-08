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
* A location an issue can be assigned to
* Currently this can be either a component or an interface
*/
public class IssueLocationQuery extends Query<IssueLocationQuery> {
    IssueLocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The unique id of the node of this location
    */
    public IssueLocationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the location
    * Max. 256 characters
    */
    public IssueLocationQuery name() {
        startField("name");

        return this;
    }

    /**
    * A textual description (of the fuction) of this issue location.
    * Max. 65536 characters
    */
    public IssueLocationQuery description() {
        startField("description");

        return this;
    }

    public class IssuesOnLocationArguments extends Arguments {
        IssuesOnLocationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public IssuesOnLocationArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public IssuesOnLocationArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public IssuesOnLocationArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public IssuesOnLocationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public IssuesOnLocationArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssuesOnLocationArgumentsDefinition {
        void define(IssuesOnLocationArguments args);
    }

    /**
    * All issues that are assinged to on this issue location matching (if given) `filterBy`
    */
    public IssueLocationQuery issuesOnLocation(IssuePageQueryDefinition queryDef) {
        return issuesOnLocation(args -> {}, queryDef);
    }

    /**
    * All issues that are assinged to on this issue location matching (if given) `filterBy`
    */
    public IssueLocationQuery issuesOnLocation(IssuesOnLocationArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issuesOnLocation");

        IssuesOnLocationArguments args = new IssuesOnLocationArguments(_queryBuilder);
        argsDef.define(args);
        IssuesOnLocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public IssueLocationQuery onComponent(ComponentQueryDefinition queryDef) {
        startInlineFragment("Component");
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueLocationQuery onComponentInterface(ComponentInterfaceQueryDefinition queryDef) {
        startInlineFragment("ComponentInterface");
        queryDef.define(new ComponentInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
