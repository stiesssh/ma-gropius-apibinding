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
* All queries for requesting stuff
*/
public class QueryQuery extends Query<QueryQuery> {
    QueryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Requests an object (node) using the given ID. If the given ID is invalid an error will be returned
    */
    public QueryQuery node(ID id, NodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class EchoArguments extends Arguments {
        EchoArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The String to be returned
        */
        public EchoArguments input(String value) {
            if (value != null) {
                startArgument("input");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface EchoArgumentsDefinition {
        void define(EchoArguments args);
    }

    /**
    * Returns the string which is given as input
    */
    public QueryQuery echo() {
        return echo(args -> {});
    }

    /**
    * Returns the string which is given as input
    */
    public QueryQuery echo(EchoArgumentsDefinition argsDef) {
        startField("echo");

        EchoArguments args = new EchoArguments(_queryBuilder);
        argsDef.define(args);
        EchoArguments.end(args);

        return this;
    }

    public class ProjectsArguments extends Arguments {
        ProjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only projects AFTER one with the given cursor (exclusive)
        */
        public ProjectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only projects BEFORE the one with the given cursor (exclusive)
        */
        public ProjectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only projects matching this filter will be returned
        */
        public ProjectsArguments filterBy(ProjectFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ projects matching the filter
        */
        public ProjectsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ projects matching the filter
        */
        public ProjectsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProjectsArgumentsDefinition {
        void define(ProjectsArguments args);
    }

    /**
    * Requests all projects within the current ccims instance mathcing the `filterBy`
    */
    public QueryQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    /**
    * Requests all projects within the current ccims instance mathcing the `filterBy`
    */
    public QueryQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the user from which the PAI is currently being accessed
    */
    public QueryQuery currentUser(UserQueryDefinition queryDef) {
        startField("currentUser");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Checks wether the given username is still available or already taken.
    * `true` is returned if the username is available and __NOT__ take
    * `false, if it __IS__ already taken and can't be used for a new user
    */
    public QueryQuery checkUsername(String username) {
        startField("checkUsername");

        _queryBuilder.append("(username:");
        Query.appendQuotedString(_queryBuilder, username.toString());

        _queryBuilder.append(')');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
