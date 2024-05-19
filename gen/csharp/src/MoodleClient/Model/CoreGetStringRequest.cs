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
    /// CoreGetStringRequest
    /// </summary>
    [DataContract(Name = "core_get_string_request")]
    public partial class CoreGetStringRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetStringRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGetStringRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetStringRequest" /> class.
        /// </summary>
        /// <param name="component">component (default to &quot;moodle&quot;).</param>
        /// <param name="lang">lang.</param>
        /// <param name="stringid">string identifier (required) (default to &quot;null&quot;).</param>
        /// <param name="stringparams">stringparams.</param>
        public CoreGetStringRequest(string component = @"moodle", string lang = default(string), string stringid = @"null", List<CoreGetStringRequestStringparamsInner> stringparams = default(List<CoreGetStringRequestStringparamsInner>))
        {
            // to ensure "stringid" is required (not null)
            if (stringid == null)
            {
                throw new ArgumentNullException("stringid is a required property for CoreGetStringRequest and cannot be null");
            }
            this.Stringid = stringid;
            // use default value if no "component" provided
            this.Component = component ?? @"moodle";
            this.Lang = lang;
            this.Stringparams = stringparams;
        }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// lang
        /// </summary>
        /// <value>lang</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// string identifier
        /// </summary>
        /// <value>string identifier</value>
        [DataMember(Name = "stringid", IsRequired = true, EmitDefaultValue = true)]
        public string Stringid { get; set; }

        /// <summary>
        /// Gets or Sets Stringparams
        /// </summary>
        [DataMember(Name = "stringparams", EmitDefaultValue = false)]
        public List<CoreGetStringRequestStringparamsInner> Stringparams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGetStringRequest {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Stringid: ").Append(Stringid).Append("\n");
            sb.Append("  Stringparams: ").Append(Stringparams).Append("\n");
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
