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
public class ComponentInterfaceQuery extends Query<ComponentInterfaceQuery> {
    ComponentInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the component interface
    * Max. 256 characters
    */
    public ComponentInterfaceQuery name() {
        startField("name");

        return this;
    }

    /**
    * A textual description (of the fuction) of this component interface .
    * Max. 65536 characters
    */
    public ComponentInterfaceQuery description() {
        startField("description");

        return this;
    }

    /**
    * The parent component of this interface which offers it
    */
    public ComponentInterfaceQuery component(ComponentQueryDefinition queryDef) {
        startField("component");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    * All issues that are assigned to this component interface matching (if given) `filterBy`
    */
    public ComponentInterfaceQuery issuesOnLocation(IssuePageQueryDefinition queryDef) {
        return issuesOnLocation(args -> {}, queryDef);
    }

    /**
    * All issues that are assigned to this component interface matching (if given) `filterBy`
    */
    public ComponentInterfaceQuery issuesOnLocation(IssuesOnLocationArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issuesOnLocation");

        IssuesOnLocationArguments args = new IssuesOnLocationArguments(_queryBuilder);
        argsDef.define(args);
        IssuesOnLocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConsumedByArguments extends Arguments {
        ConsumedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only components AFTER one with the given cursor (exclusive)
        */
        public ConsumedByArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only components BEFORE the one with the given cursor (exclusive)
        */
        public ConsumedByArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only components matching this filter will be returned
        */
        public ConsumedByArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ components matching the filter
        */
        public ConsumedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ components matching the filter
        */
        public ConsumedByArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConsumedByArgumentsDefinition {
        void define(ConsumedByArguments args);
    }

    /**
    * Components which consume the interface and match the filter.
    * If no filter is given, all components will be returned
    */
    public ComponentInterfaceQuery consumedBy(ComponentPageQueryDefinition queryDef) {
        return consumedBy(args -> {}, queryDef);
    }

    /**
    * Components which consume the interface and match the filter.
    * If no filter is given, all components will be returned
    */
    public ComponentInterfaceQuery consumedBy(ConsumedByArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("consumedBy");

        ConsumedByArguments args = new ConsumedByArguments(_queryBuilder);
        argsDef.define(args);
        ConsumedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
