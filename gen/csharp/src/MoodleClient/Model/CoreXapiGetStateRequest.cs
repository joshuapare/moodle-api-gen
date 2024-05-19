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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreXapiGetStateRequest
    /// </summary>
    [DataContract(Name = "core_xapi_get_state_request")]
    public partial class CoreXapiGetStateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreXapiGetStateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreXapiGetStateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreXapiGetStateRequest" /> class.
        /// </summary>
        /// <param name="activityId">xAPI activity ID IRI (required).</param>
        /// <param name="agent">The xAPI agent json (required).</param>
        /// <param name="component">Component name (required).</param>
        /// <param name="registration">The xAPI registration UUID.</param>
        /// <param name="stateId">The xAPI state ID (required).</param>
        public CoreXapiGetStateRequest(string activityId = default(string), string agent = default(string), string component = default(string), string registration = default(string), string stateId = default(string))
        {
            // to ensure "activityId" is required (not null)
            if (activityId == null)
            {
                throw new ArgumentNullException("activityId is a required property for CoreXapiGetStateRequest and cannot be null");
            }
            this.ActivityId = activityId;
            // to ensure "agent" is required (not null)
            if (agent == null)
            {
                throw new ArgumentNullException("agent is a required property for CoreXapiGetStateRequest and cannot be null");
            }
            this.Agent = agent;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreXapiGetStateRequest and cannot be null");
            }
            this.Component = component;
            // to ensure "stateId" is required (not null)
            if (stateId == null)
            {
                throw new ArgumentNullException("stateId is a required property for CoreXapiGetStateRequest and cannot be null");
            }
            this.StateId = stateId;
            this.Registration = registration;
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
        /// The xAPI state ID
        /// </summary>
        /// <value>The xAPI state ID</value>
        [DataMember(Name = "stateId", IsRequired = true, EmitDefaultValue = true)]
        public string StateId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreXapiGetStateRequest {\n");
            sb.Append("  ActivityId: ").Append(ActivityId).Append("\n");
            sb.Append("  Agent: ").Append(Agent).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Registration: ").Append(Registration).Append("\n");
            sb.Append("  StateId: ").Append(StateId).Append("\n");
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