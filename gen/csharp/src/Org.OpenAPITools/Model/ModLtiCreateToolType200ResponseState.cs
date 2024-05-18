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
    /// ModLtiCreateToolType200ResponseState
    /// </summary>
    [DataContract(Name = "mod_lti_create_tool_type_200_response_state")]
    public partial class ModLtiCreateToolType200ResponseState : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200ResponseState" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiCreateToolType200ResponseState() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200ResponseState" /> class.
        /// </summary>
        /// <param name="configured">Is the state configured (required) (default to null).</param>
        /// <param name="pending">Is the state pending (required) (default to null).</param>
        /// <param name="rejected">Is the state rejected (required) (default to null).</param>
        /// <param name="text">Tool type state name string (required) (default to &quot;null&quot;).</param>
        /// <param name="unknown">Is the state unknown (required) (default to null).</param>
        public ModLtiCreateToolType200ResponseState(bool configured = null, bool pending = null, bool rejected = null, string text = @"null", bool unknown = null)
        {
            this.Configured = configured;
            this.Pending = pending;
            this.Rejected = rejected;
            // to ensure "text" is required (not null)
            if (text == null)
            {
                throw new ArgumentNullException("text is a required property for ModLtiCreateToolType200ResponseState and cannot be null");
            }
            this.Text = text;
            this.Unknown = unknown;
        }

        /// <summary>
        /// Is the state configured
        /// </summary>
        /// <value>Is the state configured</value>
        [DataMember(Name = "configured", IsRequired = true, EmitDefaultValue = true)]
        public bool Configured { get; set; }

        /// <summary>
        /// Is the state pending
        /// </summary>
        /// <value>Is the state pending</value>
        [DataMember(Name = "pending", IsRequired = true, EmitDefaultValue = true)]
        public bool Pending { get; set; }

        /// <summary>
        /// Is the state rejected
        /// </summary>
        /// <value>Is the state rejected</value>
        [DataMember(Name = "rejected", IsRequired = true, EmitDefaultValue = true)]
        public bool Rejected { get; set; }

        /// <summary>
        /// Tool type state name string
        /// </summary>
        /// <value>Tool type state name string</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = true)]
        public string Text { get; set; }

        /// <summary>
        /// Is the state unknown
        /// </summary>
        /// <value>Is the state unknown</value>
        [DataMember(Name = "unknown", IsRequired = true, EmitDefaultValue = true)]
        public bool Unknown { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiCreateToolType200ResponseState {\n");
            sb.Append("  Configured: ").Append(Configured).Append("\n");
            sb.Append("  Pending: ").Append(Pending).Append("\n");
            sb.Append("  Rejected: ").Append(Rejected).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Unknown: ").Append(Unknown).Append("\n");
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