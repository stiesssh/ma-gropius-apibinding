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
* A label assignable to issues. A label is per-project
*/
public class LabelQuery extends Query<LabelQuery> {
    LabelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the label to display.
    * Max. 256 characters
    */
    public LabelQuery name() {
        startField("name");

        return this;
    }

    /**
    * A text describing the labels' function
    * Max. 65536 characters
    */
    public LabelQuery description() {
        startField("description");

        return this;
    }

    /**
    * The color of the label in the GUI
    */
    public LabelQuery color() {
        startField("color");

        return this;
    }

    public class ComponentsArguments extends Arguments {
        ComponentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only components AFTER one with the given cursor (exclusive)
        */
        public ComponentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only components BEFORE the one with the given cursor (exclusive)
        */
        public ComponentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only components matching this filter will be returned
        */
        public ComponentsArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ components matching the filter
        */
        public ComponentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ components matching the filter
        */
        public ComponentsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ComponentsArgumentsDefinition {
        void define(ComponentsArguments args);
    }

    /**
    * The components this label is available on
    */
    public LabelQuery components(ComponentPageQueryDefinition queryDef) {
        return components(args -> {}, queryDef);
    }

    /**
    * The components this label is available on
    */
    public LabelQuery components(ComponentsArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("components");

        ComponentsArguments args = new ComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    * All projetcs that this label is used on
    */
    public LabelQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    /**
    * All projetcs that this label is used on
    */
    public LabelQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
