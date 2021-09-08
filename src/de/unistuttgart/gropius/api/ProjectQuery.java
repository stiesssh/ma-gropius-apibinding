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
* A project is a one unit in which the participating components colaborate
*/
public class ProjectQuery extends Query<ProjectQuery> {
    ProjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The human readable name of this project
    * Max. 256 characters
    */
    public ProjectQuery name() {
        startField("name");

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
    * All compomponents which are a part of this project and match (if given) `filterBy`
    */
    public ProjectQuery components(ComponentPageQueryDefinition queryDef) {
        return components(args -> {}, queryDef);
    }

    /**
    * All compomponents which are a part of this project and match (if given) `filterBy`
    */
    public ProjectQuery components(ComponentsArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("components");

        ComponentsArguments args = new ComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UsersArguments extends Arguments {
        UsersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only users AFTER one with the given cursor (exclusive)
        */
        public UsersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only users BEFORE the one with the given cursor (exclusive)
        */
        public UsersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only users matching this filter will be returned
        */
        public UsersArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ users matching the filter
        */
        public UsersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ users matching the filter
        */
        public UsersArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UsersArgumentsDefinition {
        void define(UsersArguments args);
    }

    /**
    * All users that participate in this project and (if given)match `filterBy`
    */
    public ProjectQuery users(UserPageQueryDefinition queryDef) {
        return users(args -> {}, queryDef);
    }

    /**
    * All users that participate in this project and (if given)match `filterBy`
    */
    public ProjectQuery users(UsersArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("users");

        UsersArguments args = new UsersArguments(_queryBuilder);
        argsDef.define(args);
        UsersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user who administrates "owns" the project
    */
    public ProjectQuery owner(UserQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class IssuesArguments extends Arguments {
        IssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public IssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public IssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public IssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public IssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public IssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssuesArgumentsDefinition {
        void define(IssuesArguments args);
    }

    /**
    * All issues on components that are assigned to this project
    */
    public ProjectQuery issues(IssuePageQueryDefinition queryDef) {
        return issues(args -> {}, queryDef);
    }

    /**
    * All issues on components that are assigned to this project
    */
    public ProjectQuery issues(IssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issues");

        IssuesArguments args = new IssuesArguments(_queryBuilder);
        argsDef.define(args);
        IssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LabelsArguments extends Arguments {
        LabelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only labels AFTER one with the given cursor (exclusive)
        */
        public LabelsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only labels BEFORE the one with the given cursor (exclusive)
        */
        public LabelsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only labels matching this filter will be returned
        */
        public LabelsArguments filterBy(LabelFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ labels matching the filter
        */
        public LabelsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ labels matching the filter
        */
        public LabelsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LabelsArgumentsDefinition {
        void define(LabelsArguments args);
    }

    /**
    * All labels which are available on this project, matching the given filter.
    * If no filter is given, all labels will be returned
    */
    public ProjectQuery labels(LabelPageQueryDefinition queryDef) {
        return labels(args -> {}, queryDef);
    }

    /**
    * All labels which are available on this project, matching the given filter.
    * If no filter is given, all labels will be returned
    */
    public ProjectQuery labels(LabelsArgumentsDefinition argsDef, LabelPageQueryDefinition queryDef) {
        startField("labels");

        LabelsArguments args = new LabelsArguments(_queryBuilder);
        argsDef.define(args);
        LabelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LabelPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A textual description of this project.
    * Max. 65536 characters
    */
    public ProjectQuery description() {
        startField("description");

        return this;
    }
}
