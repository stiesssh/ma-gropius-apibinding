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
* A component known to ccims.
* A component can have issues and can be assigned to multiple projects. (NOTE: One IMS per component)
*/
public class ComponentQuery extends Query<ComponentQuery> {
    ComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The (non unique) display name of this component
    * Max. 256 characters
    */
    public ComponentQuery name() {
        startField("name");

        return this;
    }

    /**
    * The user who administrates "owns" the component
    */
    public ComponentQuery owner(UserQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A textual description (of the fuction) of this component.
    * Max. 65536 characters
    */
    public ComponentQuery description() {
        startField("description");

        return this;
    }

    /**
    * The IMS instance used by this component.
    */
    public ComponentQuery ims(IMSQueryDefinition queryDef) {
        startField("ims");

        _queryBuilder.append('{');
        queryDef.define(new IMSQuery(_queryBuilder));
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
    * All issues that are mirrored on this component (not the issue location but the ims) matching (if
    * given) `filterBy`
    */
    public ComponentQuery issues(IssuePageQueryDefinition queryDef) {
        return issues(args -> {}, queryDef);
    }

    /**
    * All issues that are mirrored on this component (not the issue location but the ims) matching (if
    * given) `filterBy`
    */
    public ComponentQuery issues(IssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issues");

        IssuesArguments args = new IssuesArguments(_queryBuilder);
        argsDef.define(args);
        IssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
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
    * All issues that are assigned to this components issue location matching (if given) `filterBy`
    */
    public ComponentQuery issuesOnLocation(IssuePageQueryDefinition queryDef) {
        return issuesOnLocation(args -> {}, queryDef);
    }

    /**
    * All issues that are assigned to this components issue location matching (if given) `filterBy`
    */
    public ComponentQuery issuesOnLocation(IssuesOnLocationArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issuesOnLocation");

        IssuesOnLocationArguments args = new IssuesOnLocationArguments(_queryBuilder);
        argsDef.define(args);
        IssuesOnLocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
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
    * All projects that this component is assigned to matching the `filterBy`
    */
    public ComponentQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    /**
    * All projects that this component is assigned to matching the `filterBy`
    */
    public ComponentQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InterfacesArguments extends Arguments {
        InterfacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only component interfaces AFTER one with the given cursor (exclusive)
        */
        public InterfacesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only component interfaces BEFORE the one with the given cursor (exclusive)
        */
        public InterfacesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only component interfaces matching this filter will be returned
        */
        public InterfacesArguments filterBy(ComponentInterfaceFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ component interfaces matching the filter
        */
        public InterfacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ component interfaces matching the filter
        */
        public InterfacesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface InterfacesArgumentsDefinition {
        void define(InterfacesArguments args);
    }

    /**
    * Requests component interfaces which this component offers
    */
    public ComponentQuery interfaces(ComponentInterfacePageQueryDefinition queryDef) {
        return interfaces(args -> {}, queryDef);
    }

    /**
    * Requests component interfaces which this component offers
    */
    public ComponentQuery interfaces(InterfacesArgumentsDefinition argsDef, ComponentInterfacePageQueryDefinition queryDef) {
        startField("interfaces");

        InterfacesArguments args = new InterfacesArguments(_queryBuilder);
        argsDef.define(args);
        InterfacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfacePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConsumedInterfacesArguments extends Arguments {
        ConsumedInterfacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only component interfaces AFTER one with the given cursor (exclusive)
        */
        public ConsumedInterfacesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only component interfaces BEFORE the one with the given cursor (exclusive)
        */
        public ConsumedInterfacesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only component interfaces matching this filter will be returned
        */
        public ConsumedInterfacesArguments filterBy(ComponentInterfaceFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ component interfaces matching the filter
        */
        public ConsumedInterfacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ component interfaces matching the filter
        */
        public ConsumedInterfacesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConsumedInterfacesArgumentsDefinition {
        void define(ConsumedInterfacesArguments args);
    }

    /**
    * Requests component interfaces that are used/consumed by this component
    */
    public ComponentQuery consumedInterfaces(ComponentInterfacePageQueryDefinition queryDef) {
        return consumedInterfaces(args -> {}, queryDef);
    }

    /**
    * Requests component interfaces that are used/consumed by this component
    */
    public ComponentQuery consumedInterfaces(ConsumedInterfacesArgumentsDefinition argsDef, ComponentInterfacePageQueryDefinition queryDef) {
        startField("consumedInterfaces");

        ConsumedInterfacesArguments args = new ConsumedInterfacesArguments(_queryBuilder);
        argsDef.define(args);
        ConsumedInterfacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfacePageQuery(_queryBuilder));
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
    * All labels which are available on this component, matching (if given) `filterBy`
    */
    public ComponentQuery labels(LabelPageQueryDefinition queryDef) {
        return labels(args -> {}, queryDef);
    }

    /**
    * All labels which are available on this component, matching (if given) `filterBy`
    */
    public ComponentQuery labels(LabelsArgumentsDefinition argsDef, LabelPageQueryDefinition queryDef) {
        startField("labels");

        LabelsArguments args = new LabelsArguments(_queryBuilder);
        argsDef.define(args);
        LabelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LabelPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
