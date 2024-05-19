/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreXapiGetStatesRequest
    /// </summary>
    [DataContract(Name = "core_xapi_get_states_request")]
    public partial class CoreXapiGetStatesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreXapiGetStatesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreXapiGetStatesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreXapiGetStatesRequest" /> class.
        /// </summary>
        /// <param name="activityId">xAPI activity ID IRI (required).</param>
        /// <param name="agent">The xAPI agent json (required).</param>
        /// <param name="component">Component name (required).</param>
        /// <param name="registration">The xAPI registration UUID.</param>
        /// <param name="since">Filter ids stored since the timestamp (exclusive) (default to &quot;null&quot;).</param>
        public CoreXapiGetStatesRequest(string activityId = default(string), string agent = default(string), string component = default(string), string registration = default(string), string since = @"null")
        {
            // to ensure "activityId" is required (not null)
            if (activityId == null)
            {
                throw new ArgumentNullException("activityId is a required property for CoreXapiGetStatesRequest and cannot be null");
            }
            this.ActivityId = activityId;
            // to ensure "agent" is required (not null)
            if (agent == null)
            {
                throw new ArgumentNullException("agent is a required property for CoreXapiGetStatesRequest and cannot be null");
            }
            this.Agent = agent;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreXapiGetStatesRequest and cannot be null");
            }
            this.Component = component;
            this.Registration = registration;
            // use default value if no "since" provided
            this.Since = since ?? @"null";
        }

        /// <summary>
        /// xAPI activity ID IRI
        /// </summary>
        /// <value>xAPI activity ID IRI</value>
        [DataMember(Name = "activityId", IsRequired = true, EmitDefaultValue = true)]
        public string ActivityId { get; set; }

        /// <summary>
        /// The xAPI agent json
        /// </summary>
        /// <value>The xAPI agent json</value>
        [DataMember(Name = "agent", IsRequired = true, EmitDefaultValue = true)]
        public string Agent { get; set; }

        /// <summary>
        /// Component name
        /// </summary>
        /// <value>Component name</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// The xAPI registration UUID
        /// </summary>
        /// <value>The xAPI registration UUID</value>
        [DataMember(Name = "registration", EmitDefaultValue = false)]
        public string Registration { get; set; }

        /// <summary>
        /// Filter ids stored since the timestamp (exclusive)
        /// </summary>
        /// <value>Filter ids stored since the timestamp (exclusive)</value>
        [DataMember(Name = "since", EmitDefaultValue = false)]
        public string Since { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreXapiGetStatesRequest {\n");
            sb.Append("  ActivityId: ").Append(ActivityId).Append("\n");
            sb.Append("  Agent: ").Append(Agent).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Registration: ").Append(Registration).Append("\n");
            sb.Append("  Since: ").Append(Since).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
